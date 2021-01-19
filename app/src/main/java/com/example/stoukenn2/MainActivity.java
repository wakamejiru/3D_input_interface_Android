package com.example.stoukenn2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.graphics.Color;
import android.hardware.SensorEventListener;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

import static android.bluetooth.BluetoothAdapter.ACTION_DISCOVERY_FINISHED;
import static android.bluetooth.BluetoothAdapter.ACTION_DISCOVERY_STARTED;
import static android.bluetooth.BluetoothDevice.ACTION_FOUND;
import static android.bluetooth.BluetoothDevice.ACTION_NAME_CHANGED;
import static android.view.View.SYSTEM_UI_FLAG_FULLSCREEN;
import static android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    //センサ関連の変数宣言
    private Globals globals;
    //回転軸計算用の変数
    private float[] inR = new float[16];
    private float[] outR = new float[16];
    private float[] I = new float[16];
    private float[] attitude = new float[3];
    private float[] attitude_first = new float[3];
    public static String msg=null;
    private Timer timer1;
    //タイマー秒数
    private Handler handler1;

    SensorManager sManager;
    /*センサー関係変数定義*/
    private float[] sensor_acceleration = new float[3];
    private float[] sensor_acceleration_old = new float[3];
    private float[] sensor_Lacceleration = new float[3];
    private float[] sensor_Lacceleration_old = new float[3];
    private float[] sensor_Lacceleration_first = new float[3];
    private float[] sensor_geomagnetic = new float[3];
    private float[] sensor_geomagnetic_old = new float[3];
    private float[] sensor_gyro = new float[3];
    private float[] sensor_gyro_old = new float[3];
    private boolean flag_attitude_FIRST = false;
    //Bluetooth用の変数
    private final static int DEVICES_DIALOG = 1;
    private final static int ERROR_DIALOG = 2;
    private ProgressDialog waitDialog;
    private Timer time = new Timer();
    //private String errorMessage = "";
    BluetoothTask bluetoothTask=new BluetoothTask();
    //データの作成
    //String[] Data=new String[9];
    // X軸最低スワイプ距離
    private static final int SWIPE_MIN_DISTANCE = 50;

    // X軸最低スワイプスピード
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;

    // Y軸の移動距離　これ以上なら横移動を判定しない
    private static final int SWIPE_MAX_OFF_PATH = 250;
    private GestureDetector mGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //データ転送
        timer1=new Timer();
        handler1=new Handler();
        setContentView(R.layout.activity_main);
        globals = (Globals) this.getApplication();
        Globals.globalContext = getApplication();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);//スリープ無効
        //センサを定義
        sManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Button button1 = findViewById(R.id.button6);
        Button button2 = findViewById(R.id.button4);
        Button button3 = findViewById(R.id.button8);
        Button button4 = findViewById(R.id.button7);
        Button button5 = findViewById(R.id.button56);
        Button button6 = findViewById(R.id.button57);
        button1.setOnTouchListener(new Button.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        globals.button_state_1_1 = globals.assigned_button_letter_11;
                        globals.button_state_1_2 = globals.assigned_button_letter_12;
                        break;
                    case MotionEvent.ACTION_UP:
                        globals.button_state_1_1 = "dis_" + globals.assigned_button_letter_11;
                        globals.button_state_1_2 = "dis_" + globals.assigned_button_letter_12;
                        break;
                }
                return false;
            }
        });
        button2.setOnTouchListener(new Button.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        globals.button_state_2_1 = globals.assigned_button_letter_21;
                        globals.button_state_2_2 = globals.assigned_button_letter_22;
                        break;
                    case MotionEvent.ACTION_UP:
                        globals.button_state_2_1 = "dis_" + globals.assigned_button_letter_21;
                        globals.button_state_2_2 = "dis_" + globals.assigned_button_letter_22;
                        break;
                }
                return false;
            }
        });
        button3.setOnTouchListener(new Button.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        globals.button_state_3_1 = globals.assigned_button_letter_31;
                        globals.button_state_3_2 = globals.assigned_button_letter_32;
                        break;
                    case MotionEvent.ACTION_UP:
                        globals.button_state_3_1 = "dis_" + globals.assigned_button_letter_31;
                        globals.button_state_3_2 = "dis_" + globals.assigned_button_letter_32;
                        break;
                }
                return false;
            }
        });
        button4.setOnTouchListener(new Button.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        globals.button_state_4_1 = globals.assigned_button_letter_41;
                        globals.button_state_4_2 = globals.assigned_button_letter_42;
                        break;
                    case MotionEvent.ACTION_UP:
                        globals.button_state_4_1 = "dis_" + globals.assigned_button_letter_41;
                        globals.button_state_4_2 = "dis_" + globals.assigned_button_letter_42;
                        break;
                }
                return false;
            }
        });
        button5.setOnTouchListener(new Button.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        globals.button_state_9="M_up";
                        break;
                    case MotionEvent.ACTION_UP:
                        globals.button_state_9=null;
                        break;
                }
                return false;
            }
        });
        button6.setOnTouchListener(new Button.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        globals.button_state_9="M_down";
                        break;
                    case MotionEvent.ACTION_UP:
                        globals.button_state_9=null;
                        break;
                }
                return false;
            }
        });
        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                senddata();
            }
        },0,100);
    }
    @SuppressWarnings("deprecation")
    @Override
    protected void onResume(){
        super.onResume();
        bluetoothTask.init();
        showDialog(DEVICES_DIALOG);
        View decor = getWindow().getDecorView();
        decor.setSystemUiVisibility(SYSTEM_UI_FLAG_HIDE_NAVIGATION | SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE);
        Button button1 = findViewById(R.id.button6);
        Button button2 = findViewById(R.id.button4);
        Button button3 = findViewById(R.id.button8);
        Button button4 = findViewById(R.id.button7);
        button1.setBackgroundColor(Color.parseColor(globals.collarButton1));
        button2.setBackgroundColor(Color.parseColor(globals.collarButton2));
        button3.setBackgroundColor(Color.parseColor(globals.collarButton3));
        button4.setBackgroundColor(Color.parseColor(globals.collarButton4));
        Button setupButton = findViewById(R.id.button2);
        setupButton.setOnClickListener(new View.OnClickListener() {//設定ボタンの判定
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SetupActivity.class);
                startActivity(intent);
            }
        });
        //計測の開始
        StartOperation();
    }
    @Override
    protected void onPause() {
        super.onPause();
        // Listenerを解除
        //bluetoothTask.doClose();
        bluetoothTask.doClose();
        sManager.unregisterListener((SensorEventListener) this);
    }
    private void StartOperation() {
        sManager.registerListener((SensorEventListener) this,
                sManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD),
                SensorManager.SENSOR_DELAY_UI);
        sManager.registerListener((SensorEventListener) this,
                sManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_UI);
        sManager.registerListener((SensorEventListener) this,
                sManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION),
                SensorManager.SENSOR_DELAY_UI);
        sManager.registerListener((SensorEventListener) this,
                sManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE),
                SensorManager.SENSOR_DELAY_UI);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        bluetoothTask.doClose();
        sManager.unregisterListener(this);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        //ボタンを探す
        switch (event.sensor.getType()) {
            case Sensor.TYPE_ACCELEROMETER:

                sensor_acceleration[0] = event.values[0];
                sensor_acceleration[1] = event.values[1];
                sensor_acceleration[2] = event.values[2];

                break;
            case Sensor.TYPE_LINEAR_ACCELERATION:

                sensor_Lacceleration[0] = event.values[0];
                sensor_Lacceleration[1] = event.values[1];
                sensor_Lacceleration[2] = event.values[2];

                break;
            case Sensor.TYPE_MAGNETIC_FIELD:

                sensor_geomagnetic[0] = event.values[0];
                sensor_geomagnetic[1] = event.values[1];
                sensor_geomagnetic[2] = event.values[2];

                break;

            case Sensor.TYPE_GYROSCOPE:

                sensor_gyro[0] = event.values[0];
                sensor_gyro[1] = event.values[1];
                sensor_gyro[2] = event.values[2];

                break;

        }
        //回転行列から傾きをもとめる
        if ((sensor_acceleration != null) && (sensor_geomagnetic != null) && (attitude != null)) {
            SensorManager.getRotationMatrix(inR, I, sensor_acceleration, sensor_geomagnetic);
            SensorManager.remapCoordinateSystem(inR, SensorManager.AXIS_X, SensorManager.AXIS_Y, outR);
            SensorManager.getOrientation(outR, attitude);
            //求め終わり
            if (flag_attitude_FIRST == false) {
                flag_attitude_FIRST = true;
                //attitude_first[0] = attitude[0];
                attitude_first[1] = attitude[1];
                attitude_first[2] = attitude[2];
            }

            //attitude_firstに傾きの値を入力
            if(attitude[1]>0.4){
                globals.button_state_5=globals.assigned_button_letter_5;
                globals.button_state_6=null;
            }else{
                globals.button_state_5= "dis_"+globals.assigned_button_letter_5;
                //globals.button_state_5=null;
            }
            if(attitude[1]<-0.4){
                globals.button_state_6=globals.assigned_button_letter_6;
                //globals.button_state_5=null;
            }else{
                globals.button_state_6="dis_"+globals.assigned_button_letter_6;
                //globals.button_state_6=null;
            }
            if(attitude[2]>0.4){
                globals.button_state_7=globals.assigned_button_letter_7;
                globals.button_state_8=null;
            }else{
                globals.button_state_7="dis_"+globals.assigned_button_letter_7;
                //globals.button_state_7=null;
            }
            if(attitude[2]<-0.4){
                globals.button_state_8=globals.assigned_button_letter_8;
                globals.button_state_7=null;
            }else{
                globals.button_state_8="dis_"+globals.assigned_button_letter_8;
                //globals.button_state_8=null;
            }
            attitude[0]=0;
            attitude[1]=0;
            attitude[2]=0;
            //senddata();
        }
    }





    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        //精度の変更は無し
    }
    public void senddata() {
            msg = globals.button_state_1_1 + "#" + globals.button_state_1_2 + "#" + globals.button_state_2_1 + "#" + globals.button_state_2_2 + "#" + globals.button_state_3_1 + "#" + globals.button_state_3_2 + "#" + globals.button_state_4_1 + "#" + globals.button_state_4_2 + "#" + globals.button_state_5 + "#" + globals.button_state_6 + "#" + globals.button_state_7 + "#" + globals.button_state_8;
            bluetoothTask.doSend(globals.button_state_1_1 + "#" + globals.button_state_1_2 + "#" + globals.button_state_2_1 + "#" + globals.button_state_2_2 + "#" + globals.button_state_3_1 + "#" + globals.button_state_3_2 + "#" + globals.button_state_4_1 + "#" + globals.button_state_4_2 + "#" + globals.button_state_5 + "#" + globals.button_state_6 + "#" + globals.button_state_7 + "#" + globals.button_state_8+ "#"+ globals.button_state_9+ "#");

    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == DEVICES_DIALOG) return createDevicesDialog();
        return null;
    }
    public Dialog createDevicesDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Select device");

        // ペアリング済みデバイスをダイアログのリストに設定する。
        Set<BluetoothDevice> pairedDevices = bluetoothTask.getPairedDevices();
        final BluetoothDevice[] devices = pairedDevices.toArray(new BluetoothDevice[0]);
        String[] items = new String[devices.length];
        for (int i=0;i<devices.length;i++) {
            items[i] = devices[i].getName();
        }

        alertDialogBuilder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                // 選択されたデバイスを通知する。そのまま接続開始。
                bluetoothTask.doConnect(devices[which]);
            }
        });
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.create();
        return alertDialogBuilder.create();
    }




}



