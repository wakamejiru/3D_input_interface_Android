package com.example.stoukenn2;
import android.content.Intent;

import androidx.annotation.AnimRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.ScaleAnimation;

public class SetupActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //グローバル変数の定義
        Globals globals=(Globals)this.getApplication();
        //レイアウト宣言
        setContentView(R.layout.activity_setup);
        //初期値ボタンのスタイル変更
        collarButton_assigned_number(globals.collarButton_assigned_number_1);
        collarButton_assigned_number(globals.collarButton_assigned_number_2);
        collarButton_assigned_number(globals.collarButton_assigned_number_3);
        collarButton_assigned_number(globals.collarButton_assigned_number_4);

    }
    //キーボード画面を開くintentの関数
    private void intent_assigned_letter(){
        Intent intent = new Intent(getApplication(), assigned_letter.class);
        startActivity(intent);
    }
    protected void onResume(){
        super.onResume();
        Globals globals=(Globals)this.getApplication();
        //ボタンの宣言
        Button returnButton = findViewById(R.id.button26);
        Button sendButton_assigned_letter_11 = findViewById(R.id.button27);
        Button sendButton_assigned_letter_12 = findViewById(R.id.button28);
        Button sendButton_assigned_letter_21 = findViewById(R.id.button29);
        Button sendButton_assigned_letter_22 = findViewById(R.id.button36);
        Button sendButton_assigned_letter_31 = findViewById(R.id.button30);
        Button sendButton_assigned_letter_32 = findViewById(R.id.button37);
        Button sendButton_assigned_letter_41 = findViewById(R.id.button31);
        Button sendButton_assigned_letter_42 = findViewById(R.id.button38);
        Button sendButton_assigned_letter_5 = findViewById(R.id.button34);
        Button sendButton_assigned_letter_6 = findViewById(R.id.button35);
        Button sendButton_assigned_letter_7 = findViewById(R.id.button32);
        Button sendButton_assigned_letter_8 = findViewById(R.id.button33);
        sendButton_assigned_letter_11.setText("Letter1"+"["+globals.assigned_button_letter_11+"]");
        sendButton_assigned_letter_12.setText("Letter1"+"["+globals.assigned_button_letter_12+"]");
        sendButton_assigned_letter_21.setText("Letter1"+"["+globals.assigned_button_letter_21+"]");
        sendButton_assigned_letter_22.setText("Letter1"+"["+globals.assigned_button_letter_22+"]");
        sendButton_assigned_letter_31.setText("Letter1"+"["+globals.assigned_button_letter_31+"]");
        sendButton_assigned_letter_32.setText("Letter1"+"["+globals.assigned_button_letter_32+"]");
        sendButton_assigned_letter_41.setText("Letter1"+"["+globals.assigned_button_letter_41+"]");
        sendButton_assigned_letter_42.setText("Letter1"+"["+globals.assigned_button_letter_42+"]");
        sendButton_assigned_letter_5.setText("Letter"+"["+globals.assigned_button_letter_5+"]");
        sendButton_assigned_letter_6.setText("Letter"+"["+globals.assigned_button_letter_6+"]");
        sendButton_assigned_letter_7.setText("Letter"+"["+globals.assigned_button_letter_7+"]");
        sendButton_assigned_letter_8.setText("Letter"+"["+globals.assigned_button_letter_8+"]");
        //ナビゲーションバーの非表示
        View decor = getWindow().getDecorView();
        decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE);
        //ここから色判定用のボタンの感知
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);
        findViewById(R.id.button10).setOnClickListener(this);
        findViewById(R.id.button11).setOnClickListener(this);
        findViewById(R.id.button14).setOnClickListener(this);
        findViewById(R.id.button17).setOnClickListener(this);
        findViewById(R.id.button20).setOnClickListener(this);
        findViewById(R.id.button23).setOnClickListener(this);
        findViewById(R.id.button12).setOnClickListener(this);
        findViewById(R.id.button15).setOnClickListener(this);
        findViewById(R.id.button18).setOnClickListener(this);
        findViewById(R.id.button21).setOnClickListener(this);
        findViewById(R.id.button24).setOnClickListener(this);
        findViewById(R.id.button13).setOnClickListener(this);
        findViewById(R.id.button16).setOnClickListener(this);
        findViewById(R.id.button19).setOnClickListener(this);
        findViewById(R.id.button22).setOnClickListener(this);
        findViewById(R.id.button25).setOnClickListener(this);
        //letter assigned
        //遷移用の処理を実装(SETUP→キーボード画面へ)冗長性のためにここだけこのような設計
        sendButton_assigned_letter_11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globals.assigned_button_number=11;
                intent_assigned_letter();
            }
        });
        sendButton_assigned_letter_12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globals.assigned_button_number=12;
                intent_assigned_letter();
            }
        });
        sendButton_assigned_letter_21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globals.assigned_button_number=21;
                intent_assigned_letter();
            }
        });
        sendButton_assigned_letter_22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globals.assigned_button_number=22;
                intent_assigned_letter();
            }
        });
        sendButton_assigned_letter_31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globals.assigned_button_number=31;
                intent_assigned_letter();

            }
        });
        sendButton_assigned_letter_32.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globals.assigned_button_number=32;
                intent_assigned_letter();

            }
        });
        sendButton_assigned_letter_41.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globals.assigned_button_number=41;
                intent_assigned_letter();

            }
        });
        sendButton_assigned_letter_42.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globals.assigned_button_number=42;
                intent_assigned_letter();

            }
        });
        sendButton_assigned_letter_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globals.assigned_button_number=5;
                intent_assigned_letter();

            }
        });
        sendButton_assigned_letter_6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globals.assigned_button_number=6;
                intent_assigned_letter();

            }
        });
        sendButton_assigned_letter_7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globals.assigned_button_number=7;
                intent_assigned_letter();

            }
        });
        sendButton_assigned_letter_8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globals.assigned_button_number=8;
                intent_assigned_letter();

            }
        });

        returnButton.setOnClickListener(new View.OnClickListener() {//returnボタン押されたかどうかの判定
            @Override
            public void onClick(View v) {
                Intent intentSetup = new Intent();
                setResult(RESULT_OK, intentSetup);
                finish();
            }
        });
    }
    private void collarButton_assigned_number(int collarButton_assigned_number){
        Drawable btn_color_1 = ResourcesCompat.getDrawable(getResources(), R.drawable.farme_style, null);
        Drawable btn_color_2 = ResourcesCompat.getDrawable(getResources(), R.drawable.farme_style_2, null);
        Drawable btn_color_3 = ResourcesCompat.getDrawable(getResources(), R.drawable.farme_style_3, null);
        Drawable btn_color_4 = ResourcesCompat.getDrawable(getResources(), R.drawable.farme_style_4, null);
        Drawable btn_color_5 = ResourcesCompat.getDrawable(getResources(), R.drawable.farme_style_5, null);
        Button AFA690_1 = findViewById(R.id.button);
        Button AFA690_2 = findViewById(R.id.button11);
        Button AFA690_3 = findViewById(R.id.button12);
        Button AFA690_4 = findViewById(R.id.button13);
        Button cfbb_1 = findViewById(R.id.button3);
        Button cfbb_2 = findViewById(R.id.button14);
        Button cfbb_3 = findViewById(R.id.button15);
        Button cfbb_4 = findViewById(R.id.button16);
        Button c7b83c_1 = findViewById(R.id.button5);
        Button c7b83c_2 = findViewById(R.id.button17);
        Button c7b83c_3 = findViewById(R.id.button18);
        Button c7b83c_4 = findViewById(R.id.button19);
        Button ed90ba_1 = findViewById(R.id.button9);
        Button ed90ba_2 = findViewById(R.id.button20);
        Button ed90ba_3 = findViewById(R.id.button21);
        Button ed90ba_4 = findViewById(R.id.button22);
        Button e75bec_1 = findViewById(R.id.button10);
        Button e75bec_2 = findViewById(R.id.button23);
        Button e75bec_3 = findViewById(R.id.button24);
        Button e75bec_4 = findViewById(R.id.button25);

        switch (collarButton_assigned_number){
            case 0:
                break;
            case 11:
                AFA690_1.setBackground(btn_color_1);
                break;
            case 12:
                cfbb_1.setBackground(btn_color_2);
                break;
            case 13:
                c7b83c_1.setBackground(btn_color_3);
                break;
            case 14:
                ed90ba_1.setBackground(btn_color_4);
                break;
            case 15:
                e75bec_1.setBackground(btn_color_5);
                break;
            case 21:
                AFA690_2.setBackground(btn_color_1);
                break;
            case 22:
                cfbb_2.setBackground(btn_color_2);
                break;
            case 23:
                c7b83c_2.setBackground(btn_color_3);
                break;
            case 24:
                ed90ba_2.setBackground(btn_color_4);
                break;
            case 25:
                e75bec_2.setBackground(btn_color_5);
                break;
            case 31:
                AFA690_3.setBackground(btn_color_1);
                break;
            case 32:
                cfbb_3.setBackground(btn_color_2);
                break;
            case 33:
                c7b83c_3.setBackground(btn_color_3);
                break;
            case 34:
                ed90ba_3.setBackground(btn_color_4);
                break;
            case 35:
                e75bec_3.setBackground(btn_color_5);
                break;
            case 41:
                AFA690_4.setBackground(btn_color_1);
                break;
            case 42:
                cfbb_4.setBackground(btn_color_2);
                break;
            case 43:
                c7b83c_4.setBackground(btn_color_3);
                break;
            case 44:
                ed90ba_4.setBackground(btn_color_4);
                break;
            case 45:
                e75bec_4.setBackground(btn_color_5);
                break;
        }
    }
    @Override
    public void onClick(View v) {
        Globals globals = (Globals) this.getApplication();
        switch (v.getId()) {
            //色別でしていく
            case R.id.button:
                globals.collarButton_assigned_number_1=11;
                init_style(1);
                collarButton_assigned_number(globals.collarButton_assigned_number_1);
                globals.collarButton1 = "#AFA690";
                break;
            case R.id.button11:
                init_style(2);
                globals.collarButton_assigned_number_2=21;
                collarButton_assigned_number(globals.collarButton_assigned_number_2);
                globals.collarButton2 = "#AFA690";
                break;
            case R.id.button12:
                init_style(3);
                globals.collarButton_assigned_number_3=31;
                collarButton_assigned_number(globals.collarButton_assigned_number_3);
                globals.collarButton3 = "#AFA690";
                break;
            case R.id.button13:
                init_style(4);
                globals.collarButton_assigned_number_4=41;
                collarButton_assigned_number(globals.collarButton_assigned_number_4);
                globals.collarButton4 = "#AFA690";
                break;
            //次の色
            case R.id.button3:
                init_style(1);
                globals.collarButton_assigned_number_1=12;
                collarButton_assigned_number(globals.collarButton_assigned_number_1);
                globals.collarButton1 = "#92cfbb";
                break;
            case R.id.button14:
                init_style(2);
                globals.collarButton_assigned_number_2=22;
                collarButton_assigned_number(globals.collarButton_assigned_number_2);
                globals.collarButton2 = "#92cfbb";
                break;
            case R.id.button15:
                init_style(3);
                globals.collarButton_assigned_number_3=32;
                collarButton_assigned_number(globals.collarButton_assigned_number_3);
                globals.collarButton3 = "#92cfbb";
                break;
            case R.id.button16:
                init_style(4);
                globals.collarButton_assigned_number_4=42;
                collarButton_assigned_number(globals.collarButton_assigned_number_4);
                globals.collarButton4 = "#92cfbb";
                break;
            //次の色
            case R.id.button5:
                init_style(1);
                globals.collarButton_assigned_number_1=13;
                collarButton_assigned_number(globals.collarButton_assigned_number_1);
                globals.collarButton1 = "#c7b83c";
                break;
            case R.id.button17:
                init_style(2);
                globals.collarButton_assigned_number_2=23;
                collarButton_assigned_number(globals.collarButton_assigned_number_2);
                globals.collarButton2 = "#c7b83c";
                break;
            case R.id.button18:
                init_style(3);
                globals.collarButton_assigned_number_3=33;
                collarButton_assigned_number(globals.collarButton_assigned_number_3);
                globals.collarButton3 = "#c7b83c";
                break;
            case R.id.button19:
                init_style(4);
                globals.collarButton_assigned_number_4=43;
                collarButton_assigned_number(globals.collarButton_assigned_number_4);
                globals.collarButton4 = "#c7b83c";
                break;
            //次の色
            case R.id.button9:
                init_style(1);
                globals.collarButton_assigned_number_1=14;
                collarButton_assigned_number(globals.collarButton_assigned_number_1);
                globals.collarButton1 = "#ed90ba";
                break;
            case R.id.button20:
                init_style(2);
                globals.collarButton_assigned_number_2=24;
                collarButton_assigned_number(globals.collarButton_assigned_number_2);
                globals.collarButton2 = "#ed90ba";
                break;
            case R.id.button21:
                init_style(3);
                globals.collarButton_assigned_number_3=34;
                collarButton_assigned_number(globals.collarButton_assigned_number_3);
                globals.collarButton3 = "#ed90ba";
                break;
            case R.id.button22:
                init_style(4);
                globals.collarButton_assigned_number_4=44;
                collarButton_assigned_number(globals.collarButton_assigned_number_4);
                globals.collarButton4 = "#ed90ba";
                break;
            //次の色
            case R.id.button10:
                init_style(1);
                globals.collarButton_assigned_number_1=15;
                collarButton_assigned_number(globals.collarButton_assigned_number_1);
                globals.collarButton1 = "#e75bec";
                break;
            case R.id.button23:
                init_style(2);
                globals.collarButton_assigned_number_2=25;
                collarButton_assigned_number(globals.collarButton_assigned_number_2);
                globals.collarButton2 = "#e75bec";
                break;
            case R.id.button24:
                init_style(3);
                globals.collarButton_assigned_number_3=35;
                collarButton_assigned_number(globals.collarButton_assigned_number_3);
                globals.collarButton3 = "#e75bec";
                break;
            case R.id.button25:
                init_style(4);
                globals.collarButton_assigned_number_4=45;
                collarButton_assigned_number(globals.collarButton_assigned_number_4);
                globals.collarButton4 = "#e75bec";
                break;
        }
    }
    //style初期化用関数
    private void init_style(int retsu){
        Drawable btn_color_default_1 = ResourcesCompat.getDrawable(getResources(), R.drawable.default_style, null);
        Drawable btn_color_default_2 = ResourcesCompat.getDrawable(getResources(), R.drawable.default_style_2, null);
        Drawable btn_color_default_3 = ResourcesCompat.getDrawable(getResources(), R.drawable.default_style_3, null);
        Drawable btn_color_default_4 = ResourcesCompat.getDrawable(getResources(), R.drawable.default_style_4, null);
        Drawable btn_color_default_5 = ResourcesCompat.getDrawable(getResources(), R.drawable.default_style_5, null);
        Button AFA690_1 = findViewById(R.id.button);
        Button AFA690_2 = findViewById(R.id.button11);
        Button AFA690_3 = findViewById(R.id.button12);
        Button AFA690_4 = findViewById(R.id.button13);
        Button cfbb_1 = findViewById(R.id.button3);
        Button cfbb_2 = findViewById(R.id.button14);
        Button cfbb_3 = findViewById(R.id.button15);
        Button cfbb_4 = findViewById(R.id.button16);
        Button c7b83c_1 = findViewById(R.id.button5);
        Button c7b83c_2 = findViewById(R.id.button17);
        Button c7b83c_3 = findViewById(R.id.button18);
        Button c7b83c_4 = findViewById(R.id.button19);
        Button ed90ba_1 = findViewById(R.id.button9);
        Button ed90ba_2 = findViewById(R.id.button20);
        Button ed90ba_3 = findViewById(R.id.button21);
        Button ed90ba_4 = findViewById(R.id.button22);
        Button e75bec_1 = findViewById(R.id.button10);
        Button e75bec_2 = findViewById(R.id.button23);
        Button e75bec_3 = findViewById(R.id.button24);
        Button e75bec_4 = findViewById(R.id.button25);
        switch (retsu){
            case 1:
                AFA690_1.setBackground(btn_color_default_1);
                cfbb_1.setBackground(btn_color_default_2);
                c7b83c_1.setBackground(btn_color_default_3);
                ed90ba_1.setBackground(btn_color_default_4);
                e75bec_1.setBackground(btn_color_default_5);
                break;
            case 2:
                AFA690_2.setBackground(btn_color_default_1);
                cfbb_2.setBackground(btn_color_default_2);
                c7b83c_2.setBackground(btn_color_default_3);
                ed90ba_2.setBackground(btn_color_default_4);
                e75bec_2.setBackground(btn_color_default_5);
                break;
            case 3:
                AFA690_3.setBackground(btn_color_default_1);
                cfbb_3.setBackground(btn_color_default_2);
                c7b83c_3.setBackground(btn_color_default_3);
                ed90ba_3.setBackground(btn_color_default_4);
                e75bec_3.setBackground(btn_color_default_5);
                break;
            case 4:
                AFA690_4.setBackground(btn_color_default_1);
                cfbb_4.setBackground(btn_color_default_2);
                c7b83c_4.setBackground(btn_color_default_3);
                ed90ba_4.setBackground(btn_color_default_4);
                e75bec_4.setBackground(btn_color_default_5);
                break;
        }
    }
}
