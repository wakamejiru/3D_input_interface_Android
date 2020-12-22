package com.example.stoukenn2;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;

import android.app.Application;
import android.os.AsyncTask;
import android.os.ParcelUuid;
import android.util.Log;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import androidx.appcompat.app.AppCompatActivity;

public class BluetoothTask extends AppCompatActivity{
    private static final String TAG = "BluetoothTask";
    private static final UUID APP_UUID = UUID.fromString("ca5df4b8-52ff-9efa-0ee1-ab72da671932");
    private MainActivity activity;
    private BluetoothAdapter bluetoothAdapter;
    private BluetoothDevice bluetoothDevice = null;
    private BluetoothSocket bluetoothSocket;
    //private InputStream btIn;
    private OutputStream stream;
    Globals globals = (Globals) this.getApplication();
    //Bluetoothの初期化用の関数
    public void init(){
        bluetoothAdapter= BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {
        }
    }
    //Bluetoothをペアリングした機器一覧を返す
    public Set<BluetoothDevice> getPairedDevices() {
        return bluetoothAdapter.getBondedDevices();
    }
    //非同期で指定されたデバイスの接続を行う
    public void doConnect(BluetoothDevice device) {
        bluetoothDevice = device;
        try {
            bluetoothSocket = bluetoothDevice.createRfcommSocketToServiceRecord(APP_UUID);
            new ConnectTask().execute();
        } catch (IOException e) {
            Log.e(TAG,e.toString(),e);
        }
    }
    //非同期でBluetoothの通信を切るタスキル等用
    public void doClose() {
        new CloseTask().execute();
    }
    //非同期でメッセージの通信のやり取りを行う
    public void doSend(String msg) {
        new SendTask().execute(msg);
    }
    //ここから本番の通信用クラス
    private class ConnectTask extends AsyncTask<Void, Void, Object> {

        @Override
        protected Object doInBackground(Void... params) {
            try {
                bluetoothSocket.connect();
                stream = bluetoothSocket.getOutputStream();
            } catch (Throwable t) {
                doClose();
                return  t;
            }
            return null;
        }

        @Override
        protected void onPostExecute(Object result) {
            if (result instanceof Throwable) {
                Log.e(TAG,result.toString(),(Throwable)result);
            } else {
            }
        }
    }
    //セツダン用のクラス
    private class CloseTask extends AsyncTask<Void, Void, Object> {
        @Override
        protected Object doInBackground(Void... params) {
            try {
                try{stream.close();}catch(Throwable t){/*ignore*/}
            } catch (Throwable t) {
                return t;
            }
            return null;
        }

        @Override
        protected void onPostExecute(Object result) {
            if (result instanceof Throwable) {
                Log.e(TAG,result.toString(),(Throwable)result);
            }
        }
    }
    //メッセージの送信を行う
    private class SendTask extends AsyncTask<String, Void, Object> {
        @Override
        protected Object doInBackground(String... params) {
            try {
                stream.write(
                        params[0].getBytes()
                );
                return null;
            } catch (Throwable t) {
                doClose();
                return t;
            }
        }
    }
}
