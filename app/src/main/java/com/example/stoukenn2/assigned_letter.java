package com.example.stoukenn2;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class assigned_letter extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assigned_letter);
        //ナビゲーションバーの非表示
        View decor = getWindow().getDecorView();
        decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE);
        //グローバル変数の定義
        Globals globals = (Globals) this.getApplication();
        //開く際にボタンの着色を行う
        switch (globals.assigned_button_number) {
            case 11:
                paint_color_button(globals.assigned_button_11);
                break;
            case 12:
                paint_color_button(globals.assigned_button_12);
                break;
            case 21:
                paint_color_button(globals.assigned_button_21);
                break;
            case 22:
                paint_color_button(globals.assigned_button_22);
                break;
            case 31:
                paint_color_button(globals.assigned_button_31);
                break;
            case 32:
                paint_color_button(globals.assigned_button_32);
                break;
            case 41:
                paint_color_button(globals.assigned_button_41);
                break;
            case 42:
                paint_color_button(globals.assigned_button_42);
                break;
            case 5:
                paint_color_button(globals.assigned_button_forward);
                break;
            case 6:
                paint_color_button(globals.assigned_button_back);
                break;
            case 7:
                paint_color_button(globals.assigned_button_right);
                break;
            case 8:
                paint_color_button(globals.assigned_button_left);
                break;
        }

    }
    protected void onResume(){
        super.onResume();
        //ナビゲーションバーの非表示
        View decor = getWindow().getDecorView();
        decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE);
        Button return_SETUP = findViewById(R.id.button139);
        findViewById(R.id.button40).setOnClickListener(this);
        findViewById(R.id.button42).setOnClickListener(this);
        findViewById(R.id.button43).setOnClickListener(this);
        findViewById(R.id.button44).setOnClickListener(this);
        findViewById(R.id.button45).setOnClickListener(this);
        findViewById(R.id.button46).setOnClickListener(this);
        findViewById(R.id.button47).setOnClickListener(this);
        findViewById(R.id.button48).setOnClickListener(this);
        findViewById(R.id.button49).setOnClickListener(this);
        findViewById(R.id.button50).setOnClickListener(this);
        findViewById(R.id.button51).setOnClickListener(this);
        findViewById(R.id.button52).setOnClickListener(this);
        findViewById(R.id.button53).setOnClickListener(this);
        findViewById(R.id.button54).setOnClickListener(this);
        findViewById(R.id.button59).setOnClickListener(this);
        findViewById(R.id.button60).setOnClickListener(this);
        findViewById(R.id.button61).setOnClickListener(this);
        findViewById(R.id.button62).setOnClickListener(this);
        findViewById(R.id.button63).setOnClickListener(this);
        findViewById(R.id.button64).setOnClickListener(this);
        findViewById(R.id.button65).setOnClickListener(this);
        findViewById(R.id.button66).setOnClickListener(this);
        findViewById(R.id.button67).setOnClickListener(this);
        findViewById(R.id.button68).setOnClickListener(this);
        findViewById(R.id.button69).setOnClickListener(this);
        findViewById(R.id.button70).setOnClickListener(this);
        findViewById(R.id.button71).setOnClickListener(this);
        findViewById(R.id.button77).setOnClickListener(this);
        findViewById(R.id.button73).setOnClickListener(this);
        findViewById(R.id.button76).setOnClickListener(this);
        findViewById(R.id.button72).setOnClickListener(this);
        findViewById(R.id.button74).setOnClickListener(this);
        findViewById(R.id.button79).setOnClickListener(this);
        findViewById(R.id.button80).setOnClickListener(this);
        findViewById(R.id.button81).setOnClickListener(this);
        findViewById(R.id.button82).setOnClickListener(this);
        findViewById(R.id.button83).setOnClickListener(this);
        findViewById(R.id.button85).setOnClickListener(this);
        findViewById(R.id.button86).setOnClickListener(this);
        findViewById(R.id.button75).setOnClickListener(this);
        findViewById(R.id.button84).setOnClickListener(this);
        findViewById(R.id.button107).setOnClickListener(this);
        findViewById(R.id.button103).setOnClickListener(this);
        findViewById(R.id.button106).setOnClickListener(this);
        findViewById(R.id.button102).setOnClickListener(this);
        findViewById(R.id.button104).setOnClickListener(this);
        findViewById(R.id.button109).setOnClickListener(this);
        findViewById(R.id.button110).setOnClickListener(this);
        findViewById(R.id.button111).setOnClickListener(this);
        findViewById(R.id.button112).setOnClickListener(this);
        findViewById(R.id.button113).setOnClickListener(this);
        findViewById(R.id.button115).setOnClickListener(this);
        findViewById(R.id.button116).setOnClickListener(this);
        findViewById(R.id.button105).setOnClickListener(this);
        findViewById(R.id.button122).setOnClickListener(this);
        findViewById(R.id.button118).setOnClickListener(this);
        findViewById(R.id.button121).setOnClickListener(this);
        findViewById(R.id.button117).setOnClickListener(this);
        findViewById(R.id.button119).setOnClickListener(this);
        findViewById(R.id.button124).setOnClickListener(this);
        findViewById(R.id.button125).setOnClickListener(this);
        findViewById(R.id.button126).setOnClickListener(this);
        findViewById(R.id.button127).setOnClickListener(this);
        findViewById(R.id.button128).setOnClickListener(this);
        findViewById(R.id.button130).setOnClickListener(this);
        findViewById(R.id.button131).setOnClickListener(this);
        findViewById(R.id.button120).setOnClickListener(this);
        findViewById(R.id.button132).setOnClickListener(this);
        findViewById(R.id.button39).setOnClickListener(this);
        findViewById(R.id.button134).setOnClickListener(this);
        findViewById(R.id.button41).setOnClickListener(this);
        findViewById(R.id.button133).setOnClickListener(this);
        findViewById(R.id.button136).setOnClickListener(this);
        findViewById(R.id.button135).setOnClickListener(this);
        findViewById(R.id.button137).setOnClickListener(this);
        findViewById(R.id.button138).setOnClickListener(this);
        findViewById(R.id.button55).setOnClickListener(this);
        //ボタン配色
        color_paint_eraser();
        return_SETUP.setOnClickListener(new View.OnClickListener() {//returnボタン押されたかどうかの判定
            @Override
            public void onClick(View v) {
                all_delete_color_button();
                Intent intentSetup = new Intent();
                setResult(RESULT_OK, intentSetup);
                finish();
            }
        });
    }
    //ボタンの再色
    public void color_paint_eraser(){
        Globals globals = (Globals) this.getApplication();
        all_delete_color_button();
        //もう一度ボタンの色付け
        switch (globals.assigned_button_number) {
            case 11:
                paint_color_button(globals.assigned_button_11);
                break;
            case 12:
                paint_color_button(globals.assigned_button_12);
                break;
            case 21:
                paint_color_button(globals.assigned_button_21);
                break;
            case 22:
                paint_color_button(globals.assigned_button_22);
                break;
            case 31:
                paint_color_button(globals.assigned_button_31);
                break;
            case 32:
                paint_color_button(globals.assigned_button_32);
                break;
            case 41:
                paint_color_button(globals.assigned_button_41);
                break;
            case 42:
                paint_color_button(globals.assigned_button_42);
                break;
            case 5:
                paint_color_button(globals.assigned_button_forward);
                break;
            case 6:
                paint_color_button(globals.assigned_button_back);
                break;
            case 7:
                paint_color_button(globals.assigned_button_right);
                break;
            case 8:
                paint_color_button(globals.assigned_button_left);
                break;
        }
    }
    //すべてのボタンの色を削除
    private void all_delete_color_button() {
        Button F1_button = findViewById(R.id.button40);
        Button F2_button = findViewById(R.id.button42);
        Button F3_button = findViewById(R.id.button43);
        Button F4_button = findViewById(R.id.button44);
        Button F5_button = findViewById(R.id.button45);
        Button F6_button = findViewById(R.id.button46);
        Button F7_button = findViewById(R.id.button47);
        Button F8_button = findViewById(R.id.button48);
        Button F9_button = findViewById(R.id.button49);
        Button F10_button = findViewById(R.id.button50);
        Button F11_button = findViewById(R.id.button51);
        Button F12_button = findViewById(R.id.button52);
        Button henkaku = findViewById(R.id.button53);
        Button N_1 = findViewById(R.id.button54);
        Button N_2 = findViewById(R.id.button59);
        Button N_3 = findViewById(R.id.button60);
        Button N_4 = findViewById(R.id.button61);
        Button N_5 = findViewById(R.id.button62);
        Button N_6 = findViewById(R.id.button63);
        Button N_7 = findViewById(R.id.button64);
        Button N_8 = findViewById(R.id.button65);
        Button N_9 = findViewById(R.id.button66);
        Button N_0 = findViewById(R.id.button67);
        Button S_H = findViewById(R.id.button68);
        Button S_SF = findViewById(R.id.button69);
        Button S_BS1 = findViewById(R.id.button70);
        Button back = findViewById(R.id.button71);
        Button tab = findViewById(R.id.button77);
        Button q = findViewById(R.id.button73);
        Button w = findViewById(R.id.button76);
        Button e = findViewById(R.id.button72);
        Button r = findViewById(R.id.button74);
        Button t = findViewById(R.id.button79);
        Button y = findViewById(R.id.button80);
        Button u = findViewById(R.id.button81);
        Button i = findViewById(R.id.button82);
        Button o = findViewById(R.id.button83);
        Button p = findViewById(R.id.button85);
        Button S_AS = findViewById(R.id.button86);
        Button S_BL = findViewById(R.id.button75);
        Button enter = findViewById(R.id.button84);
        Button caps = findViewById(R.id.button107);
        Button a = findViewById(R.id.button103);
        Button s = findViewById(R.id.button106);
        Button d = findViewById(R.id.button102);
        Button f = findViewById(R.id.button104);
        Button g = findViewById(R.id.button109);
        Button h = findViewById(R.id.button110);
        Button j = findViewById(R.id.button111);
        Button k = findViewById(R.id.button112);
        Button l = findViewById(R.id.button113);
        Button S_SC = findViewById(R.id.button115);
        Button S_C = findViewById(R.id.button116);
        Button S_BR = findViewById(R.id.button105);
        Button shift_L = findViewById(R.id.button122);
        Button z = findViewById(R.id.button118);
        Button x = findViewById(R.id.button121);
        Button c = findViewById(R.id.button117);
        Button v = findViewById(R.id.button119);
        Button b = findViewById(R.id.button124);
        Button n = findViewById(R.id.button125);
        Button m = findViewById(R.id.button126);
        Button S_CM = findViewById(R.id.button127);
        Button S_P = findViewById(R.id.button128);
        Button S_S = findViewById(R.id.button130);
        Button S_BS2 = findViewById(R.id.button131);
        Button shift_R = findViewById(R.id.button120);
        Button ctr_L = findViewById(R.id.button132);
        Button alt_L = findViewById(R.id.button39);
        Button space = findViewById(R.id.button134);
        Button alt_R = findViewById(R.id.button41);
        Button ctr_R = findViewById(R.id.button133);
        Button up = findViewById(R.id.button136);
        Button down = findViewById(R.id.button135);
        Button left = findViewById(R.id.button137);
        Button right = findViewById(R.id.button138);
        Button Null = findViewById(R.id.button55);
        F1_button.setBackgroundResource(android.R.drawable.btn_default);
        F2_button.setBackgroundResource(android.R.drawable.btn_default);
        F3_button.setBackgroundResource(android.R.drawable.btn_default);
        F4_button.setBackgroundResource(android.R.drawable.btn_default);
        F5_button.setBackgroundResource(android.R.drawable.btn_default);
        F6_button.setBackgroundResource(android.R.drawable.btn_default);
        F7_button.setBackgroundResource(android.R.drawable.btn_default);
        F8_button.setBackgroundResource(android.R.drawable.btn_default);
        F9_button.setBackgroundResource(android.R.drawable.btn_default);
        F10_button.setBackgroundResource(android.R.drawable.btn_default);
        F11_button.setBackgroundResource(android.R.drawable.btn_default);
        F12_button.setBackgroundResource(android.R.drawable.btn_default);
        henkaku.setBackgroundResource(android.R.drawable.btn_default);
        N_1.setBackgroundResource(android.R.drawable.btn_default);
        N_2.setBackgroundResource(android.R.drawable.btn_default);
        N_3.setBackgroundResource(android.R.drawable.btn_default);
        N_4.setBackgroundResource(android.R.drawable.btn_default);
        N_5.setBackgroundResource(android.R.drawable.btn_default);
        N_6.setBackgroundResource(android.R.drawable.btn_default);
        N_7.setBackgroundResource(android.R.drawable.btn_default);
        N_8.setBackgroundResource(android.R.drawable.btn_default);
        N_9.setBackgroundResource(android.R.drawable.btn_default);
        N_0.setBackgroundResource(android.R.drawable.btn_default);
        S_H.setBackgroundResource(android.R.drawable.btn_default);
        S_SF.setBackgroundResource(android.R.drawable.btn_default);
        S_BS1.setBackgroundResource(android.R.drawable.btn_default);
        back.setBackgroundResource(android.R.drawable.btn_default);
        tab.setBackgroundResource(android.R.drawable.btn_default);
        q.setBackgroundResource(android.R.drawable.btn_default);
        w.setBackgroundResource(android.R.drawable.btn_default);
        e.setBackgroundResource(android.R.drawable.btn_default);
        r.setBackgroundResource(android.R.drawable.btn_default);
        t.setBackgroundResource(android.R.drawable.btn_default);
        y.setBackgroundResource(android.R.drawable.btn_default);
        u.setBackgroundResource(android.R.drawable.btn_default);
        i.setBackgroundResource(android.R.drawable.btn_default);
        o.setBackgroundResource(android.R.drawable.btn_default);
        p.setBackgroundResource(android.R.drawable.btn_default);
        S_AS.setBackgroundResource(android.R.drawable.btn_default);
        S_BL.setBackgroundResource(android.R.drawable.btn_default);
        enter.setBackgroundResource(android.R.drawable.btn_default);
        caps.setBackgroundResource(android.R.drawable.btn_default);
        a.setBackgroundResource(android.R.drawable.btn_default);
        s.setBackgroundResource(android.R.drawable.btn_default);
        d.setBackgroundResource(android.R.drawable.btn_default);
        f.setBackgroundResource(android.R.drawable.btn_default);
        g.setBackgroundResource(android.R.drawable.btn_default);
        h.setBackgroundResource(android.R.drawable.btn_default);
        j.setBackgroundResource(android.R.drawable.btn_default);
        k.setBackgroundResource(android.R.drawable.btn_default);
        l.setBackgroundResource(android.R.drawable.btn_default);
        S_SC.setBackgroundResource(android.R.drawable.btn_default);
        S_C.setBackgroundResource(android.R.drawable.btn_default);
        S_BR.setBackgroundResource(android.R.drawable.btn_default);
        shift_L.setBackgroundResource(android.R.drawable.btn_default);
        z.setBackgroundResource(android.R.drawable.btn_default);
        x.setBackgroundResource(android.R.drawable.btn_default);
        c.setBackgroundResource(android.R.drawable.btn_default);
        v.setBackgroundResource(android.R.drawable.btn_default);
        b.setBackgroundResource(android.R.drawable.btn_default);
        n.setBackgroundResource(android.R.drawable.btn_default);
        m.setBackgroundResource(android.R.drawable.btn_default);
        S_CM.setBackgroundResource(android.R.drawable.btn_default);
        S_P.setBackgroundResource(android.R.drawable.btn_default);
        S_S.setBackgroundResource(android.R.drawable.btn_default);
        S_BS2.setBackgroundResource(android.R.drawable.btn_default);
        shift_R.setBackgroundResource(android.R.drawable.btn_default);
        ctr_L.setBackgroundResource(android.R.drawable.btn_default);
        alt_L.setBackgroundResource(android.R.drawable.btn_default);
        space.setBackgroundResource(android.R.drawable.btn_default);
        alt_R.setBackgroundResource(android.R.drawable.btn_default);
        ctr_R.setBackgroundResource(android.R.drawable.btn_default);
        up.setBackgroundResource(android.R.drawable.btn_default);
        down.setBackgroundResource(android.R.drawable.btn_default);
        right.setBackgroundResource(android.R.drawable.btn_default);
        left.setBackgroundResource(android.R.drawable.btn_default);
        Null.setBackgroundResource(android.R.drawable.btn_default);
    }

    //関数の引数として入力された値に相当するボタンの色を付ける
    public void paint_color_button(int paint_color_button_number) {
        Button F1_button = findViewById(R.id.button40);
        Button F2_button = findViewById(R.id.button42);
        Button F3_button = findViewById(R.id.button43);
        Button F4_button = findViewById(R.id.button44);
        Button F5_button = findViewById(R.id.button45);
        Button F6_button = findViewById(R.id.button46);
        Button F7_button = findViewById(R.id.button47);
        Button F8_button = findViewById(R.id.button48);
        Button F9_button = findViewById(R.id.button49);
        Button F10_button = findViewById(R.id.button50);
        Button F11_button = findViewById(R.id.button51);
        Button F12_button = findViewById(R.id.button52);
        Button henkaku = findViewById(R.id.button53);
        Button N_1 = findViewById(R.id.button54);
        Button N_2 = findViewById(R.id.button59);
        Button N_3 = findViewById(R.id.button60);
        Button N_4 = findViewById(R.id.button61);
        Button N_5 = findViewById(R.id.button62);
        Button N_6 = findViewById(R.id.button63);
        Button N_7 = findViewById(R.id.button64);
        Button N_8 = findViewById(R.id.button65);
        Button N_9 = findViewById(R.id.button66);
        Button N_0 = findViewById(R.id.button67);
        Button S_H = findViewById(R.id.button68);
        Button S_SF = findViewById(R.id.button69);
        Button S_BS1 = findViewById(R.id.button70);
        Button back = findViewById(R.id.button71);
        Button tab = findViewById(R.id.button77);
        Button q = findViewById(R.id.button73);
        Button w = findViewById(R.id.button76);
        Button e = findViewById(R.id.button72);
        Button r = findViewById(R.id.button74);
        Button t = findViewById(R.id.button79);
        Button y = findViewById(R.id.button80);
        Button u = findViewById(R.id.button81);
        Button i = findViewById(R.id.button82);
        Button o = findViewById(R.id.button83);
        Button p = findViewById(R.id.button85);
        Button S_AS = findViewById(R.id.button86);
        Button S_BL = findViewById(R.id.button75);
        Button enter = findViewById(R.id.button84);
        Button caps = findViewById(R.id.button107);
        Button a = findViewById(R.id.button103);
        Button s = findViewById(R.id.button106);
        Button d = findViewById(R.id.button102);
        Button f = findViewById(R.id.button104);
        Button g = findViewById(R.id.button109);
        Button h = findViewById(R.id.button110);
        Button j = findViewById(R.id.button111);
        Button k = findViewById(R.id.button112);
        Button l = findViewById(R.id.button113);
        Button S_SC = findViewById(R.id.button115);
        Button S_C = findViewById(R.id.button116);
        Button S_BR = findViewById(R.id.button105);
        Button shift_L = findViewById(R.id.button122);
        Button z = findViewById(R.id.button118);
        Button x = findViewById(R.id.button121);
        Button c = findViewById(R.id.button117);
        Button v = findViewById(R.id.button119);
        Button b = findViewById(R.id.button124);
        Button n = findViewById(R.id.button125);
        Button m = findViewById(R.id.button126);
        Button S_CM = findViewById(R.id.button127);
        Button S_P = findViewById(R.id.button128);
        Button S_S = findViewById(R.id.button130);
        Button S_BS2 = findViewById(R.id.button131);
        Button shift_R = findViewById(R.id.button120);
        Button ctr_L = findViewById(R.id.button132);
        Button alt_L = findViewById(R.id.button39);
        Button space = findViewById(R.id.button134);
        Button alt_R = findViewById(R.id.button41);
        Button ctr_R = findViewById(R.id.button133);
        Button up = findViewById(R.id.button136);
        Button down = findViewById(R.id.button135);
        Button left = findViewById(R.id.button137);
        Button right = findViewById(R.id.button138);
        Button Null = findViewById(R.id.button55);
        switch (paint_color_button_number) {
            case 0:
                break;
            case 1:
                F1_button.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 2:
                F2_button.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 3:
                F3_button.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 4:
                F4_button.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 5:
                F5_button.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 6:
                F6_button.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 7:
                F7_button.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 8:
                F8_button.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 9:
                F9_button.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 10:
                F10_button.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 11:
                F11_button.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 12:
                F12_button.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 13:
                henkaku.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 14:
                N_1.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 15:
                N_2.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 16:
                N_3.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 17:
                N_4.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 18:
                N_5.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 19:
                N_6.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 20:
                N_7.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 21:
                N_8.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 22:
                N_9.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 23:
                N_0.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 24:
                S_H.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 25:
                S_SF.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 26:
                S_BS1.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 27:
                back.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 28:
                tab.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 29:
                q.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 30:
                w.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 31:
                e.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 32:
                r.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 33:
                t.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 34:
                y.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 35:
                u.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 36:
                i.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 37:
                o.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 38:
                p.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 39:
                S_AS.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 40:
                S_BL.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 41:
                enter.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 42:
                caps.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 43:
                a.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 44:
                s.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 45:
                d.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 46:
                f.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 47:
                g.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 48:
                h.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 49:
                j.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 50:
                k.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 51:
                l.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 52:
                S_SC.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 53:
                S_C.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 54:
                S_BR.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 55:
                shift_L.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 56:
                z.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 57:
                x.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 58:
                c.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 59:
                v.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 60:
                b.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 61:
                n.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 62:
                m.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 63:
                S_CM.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 64:
                S_P.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 65:
                S_S.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 66:
                S_BS2.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 67:
                shift_R.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 68:
                ctr_L.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 69:
                alt_L.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 70:
                space.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 71:
                alt_R.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 72:
                ctr_R.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 73:
                up.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 74:
                down.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 75:
                right.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 76:
                left.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
            case 77:
                Null.setBackgroundColor(Color.parseColor("#89c3eb"));
                break;
        }
    }
    @Override
    public void onClick(View v) {
        Globals globals = (Globals) Globals.globalContext;
        switch (v.getId()) {
            case R.id.button40:
                globals.provisional_Assigned_button = 1;
                globals.provisional_Assigned_button_letter = "F1";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button42:
                globals.provisional_Assigned_button = 2;
                globals.provisional_Assigned_button_letter = "F2";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button43:
                globals.provisional_Assigned_button = 3;
                globals.provisional_Assigned_button_letter = "F3";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button44:
                globals.provisional_Assigned_button = 4;
                globals.provisional_Assigned_button_letter = "F4";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button45:
                globals.provisional_Assigned_button = 5;
                globals.provisional_Assigned_button_letter = "F5";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button46:
                globals.provisional_Assigned_button = 6;
                globals.provisional_Assigned_button_letter = "F6";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button47:
                globals.provisional_Assigned_button = 7;
                globals.provisional_Assigned_button_letter = "F7";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button48:
                globals.provisional_Assigned_button = 8;
                globals.provisional_Assigned_button_letter = "F8";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button49:
                globals.provisional_Assigned_button = 9;
                globals.provisional_Assigned_button_letter = "F9";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button50:
                globals.provisional_Assigned_button = 10;
                globals.provisional_Assigned_button_letter = "F10";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button51:
                globals.provisional_Assigned_button = 11;
                globals.provisional_Assigned_button_letter = "F11";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button52:
                globals.provisional_Assigned_button = 12;
                globals.provisional_Assigned_button_letter = "F12";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button53:
                globals.provisional_Assigned_button = 13;
                globals.provisional_Assigned_button_letter = "hennkaku";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button54:
                globals.provisional_Assigned_button = 14;
                globals.provisional_Assigned_button_letter = "1";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button59:
                globals.provisional_Assigned_button = 15;
                globals.provisional_Assigned_button_letter = "2";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button60:
                globals.provisional_Assigned_button = 16;
                globals.provisional_Assigned_button_letter = "3";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button61:
                globals.provisional_Assigned_button = 17;
                globals.provisional_Assigned_button_letter = "4";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button62:
                globals.provisional_Assigned_button = 18;
                globals.provisional_Assigned_button_letter = "5";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button63:
                globals.provisional_Assigned_button = 19;
                globals.provisional_Assigned_button_letter = "6";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button64:
                globals.provisional_Assigned_button = 20;
                globals.provisional_Assigned_button_letter = "7";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button65:
                globals.provisional_Assigned_button = 21;
                globals.provisional_Assigned_button_letter = "8";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button66:
                globals.provisional_Assigned_button = 22;
                globals.provisional_Assigned_button_letter = "9";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button67:
                globals.provisional_Assigned_button = 23;
                globals.provisional_Assigned_button_letter = "0";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button68:
                globals.provisional_Assigned_button = 24;
                globals.provisional_Assigned_button_letter = "-";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button69:
                globals.provisional_Assigned_button = 25;
                globals.provisional_Assigned_button_letter = "^";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button70:
                globals.provisional_Assigned_button = 26;
                globals.provisional_Assigned_button_letter = "_";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button71:
                globals.provisional_Assigned_button = 27;
                globals.provisional_Assigned_button_letter = "back_space";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button77:
                globals.provisional_Assigned_button = 28;
                globals.provisional_Assigned_button_letter = "tab";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button73:
                globals.provisional_Assigned_button = 29;
                globals.provisional_Assigned_button_letter = "q";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button76:
                globals.provisional_Assigned_button = 30;
                globals.provisional_Assigned_button_letter = "w";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button72:
                globals.provisional_Assigned_button = 31;
                globals.provisional_Assigned_button_letter = "e";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button74:
                globals.provisional_Assigned_button = 32;
                globals.provisional_Assigned_button_letter = "r";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button79:
                globals.provisional_Assigned_button = 33;
                globals.provisional_Assigned_button_letter = "t";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button80:
                globals.provisional_Assigned_button = 34;
                globals.provisional_Assigned_button_letter = "y";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button81:
                globals.provisional_Assigned_button = 35;
                globals.provisional_Assigned_button_letter = "u";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button82:
                globals.provisional_Assigned_button = 36;
                globals.provisional_Assigned_button_letter = "i";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button83:
                globals.provisional_Assigned_button = 37;
                globals.provisional_Assigned_button_letter = "o";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button85:
                globals.provisional_Assigned_button = 38;
                globals.provisional_Assigned_button_letter = "p";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button86:
                globals.provisional_Assigned_button = 39;
                globals.provisional_Assigned_button_letter = "@";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button75:
                globals.provisional_Assigned_button = 40;
                globals.provisional_Assigned_button_letter = "[";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button84:
                globals.provisional_Assigned_button = 41;
                globals.provisional_Assigned_button_letter = "enter";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button107:
                globals.provisional_Assigned_button = 42;
                globals.provisional_Assigned_button_letter = "CAPS";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button103:
                globals.provisional_Assigned_button = 43;
                globals.provisional_Assigned_button_letter = "a";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button106:
                globals.provisional_Assigned_button = 44;
                globals.provisional_Assigned_button_letter = "s";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button102:
                globals.provisional_Assigned_button = 45;
                globals.provisional_Assigned_button_letter = "d";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button104:
                globals.provisional_Assigned_button = 46;
                globals.provisional_Assigned_button_letter = "f";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button109:
                globals.provisional_Assigned_button = 47;
                globals.provisional_Assigned_button_letter = "g";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button110:
                globals.provisional_Assigned_button = 48;
                globals.provisional_Assigned_button_letter = "h";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button111:
                globals.provisional_Assigned_button = 49;
                globals.provisional_Assigned_button_letter = "j";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button112:
                globals.provisional_Assigned_button = 50;
                globals.provisional_Assigned_button_letter = "k";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button113:
                globals.provisional_Assigned_button = 51;
                globals.provisional_Assigned_button_letter = "l";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button115:
                globals.provisional_Assigned_button = 52;
                globals.provisional_Assigned_button_letter = ";";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button116:
                globals.provisional_Assigned_button = 53;
                globals.provisional_Assigned_button_letter = ":";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button105:
                globals.provisional_Assigned_button = 54;
                globals.provisional_Assigned_button_letter = "]";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button122:
                globals.provisional_Assigned_button = 55;
                globals.provisional_Assigned_button_letter = "shift_L";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button118:
                globals.provisional_Assigned_button = 56;
                globals.provisional_Assigned_button_letter = "z";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button121:
                globals.provisional_Assigned_button = 57;
                globals.provisional_Assigned_button_letter = "x";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button117:
                globals.provisional_Assigned_button = 58;
                globals.provisional_Assigned_button_letter = "c";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button119:
                globals.provisional_Assigned_button = 59;
                globals.provisional_Assigned_button_letter = "v";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button124:
                globals.provisional_Assigned_button = 60;
                globals.provisional_Assigned_button_letter = "b";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button125:
                globals.provisional_Assigned_button = 61;
                globals.provisional_Assigned_button_letter = "n";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button126:
                globals.provisional_Assigned_button = 62;
                globals.provisional_Assigned_button_letter = "m";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button127:
                globals.provisional_Assigned_button = 63;
                globals.provisional_Assigned_button_letter = ",";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button128:
                globals.provisional_Assigned_button = 64;
                globals.provisional_Assigned_button_letter = ".";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button130:
                globals.provisional_Assigned_button = 65;
                globals.provisional_Assigned_button_letter = "/";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button131:
                globals.provisional_Assigned_button = 66;
                globals.provisional_Assigned_button_letter = "_";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button120:
                globals.provisional_Assigned_button = 67;
                globals.provisional_Assigned_button_letter = "shift_R";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button132:
                globals.provisional_Assigned_button = 68;
                globals.provisional_Assigned_button_letter = "ctrl_L";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button39:
                globals.provisional_Assigned_button = 69;
                globals.provisional_Assigned_button_letter = "Alt_L";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button134:
                globals.provisional_Assigned_button = 70;
                globals.provisional_Assigned_button_letter = "space";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button41:
                globals.provisional_Assigned_button = 71;
                globals.provisional_Assigned_button_letter = "Alt_R";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button133:
                globals.provisional_Assigned_button = 72;
                globals.provisional_Assigned_button_letter = "ctrl_R";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button136:
                globals.provisional_Assigned_button = 73;
                globals.provisional_Assigned_button_letter = "up";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button135:
                globals.provisional_Assigned_button = 74;
                globals.provisional_Assigned_button_letter = "down";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button137:
                globals.provisional_Assigned_button = 76;
                globals.provisional_Assigned_button_letter = "right";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button138:
                globals.provisional_Assigned_button = 75;
                globals.provisional_Assigned_button_letter = "left";
                assigned_button_number();
                color_paint_eraser();
                break;
            case R.id.button55:
                globals.provisional_Assigned_button = 77;
                globals.provisional_Assigned_button_letter = "null";
                assigned_button_number();
                color_paint_eraser();
                break;
        }
    }
    private void assigned_button_number(){
        Globals globals = (Globals) Globals.globalContext;
        switch(globals.assigned_button_number){
            case 11:
                if(globals.provisional_Assigned_button!=globals.assigned_button_11){
                    globals.erase_button_color_id=globals.assigned_button_11;
                    globals.paint_button_color_id=globals.provisional_Assigned_button;
                    globals.assigned_button_11=globals.provisional_Assigned_button;
                }
                globals.assigned_button_letter_11=globals.provisional_Assigned_button_letter;
                globals.assigned_button_11=globals.provisional_Assigned_button;
                break;
            case 12:
                if(globals.provisional_Assigned_button!=globals.assigned_button_12){
                    globals.erase_button_color_id=globals.assigned_button_12;
                    globals.paint_button_color_id=globals.provisional_Assigned_button;
                    globals.assigned_button_12=globals.provisional_Assigned_button;
                }
                globals.assigned_button_letter_12=globals.provisional_Assigned_button_letter;
                globals.assigned_button_12=globals.provisional_Assigned_button;
                break;
            case 21:
                if(globals.provisional_Assigned_button!=globals.assigned_button_21){
                    globals.erase_button_color_id=globals.assigned_button_21;
                    globals.paint_button_color_id=globals.provisional_Assigned_button;
                    globals.assigned_button_21=globals.provisional_Assigned_button;
                }
                globals.assigned_button_letter_21=globals.provisional_Assigned_button_letter;
                globals.assigned_button_21=globals.provisional_Assigned_button;
                break;
            case 22:
                if(globals.provisional_Assigned_button!=globals.assigned_button_22){
                    globals.erase_button_color_id=globals.assigned_button_22;
                    globals.paint_button_color_id=globals.provisional_Assigned_button;
                    globals.assigned_button_22=globals.provisional_Assigned_button;
                }
                globals.assigned_button_letter_22=globals.provisional_Assigned_button_letter;
                globals.assigned_button_22=globals.provisional_Assigned_button;
                break;
            case 31:
                if(globals.provisional_Assigned_button!=globals.assigned_button_31){
                    globals.erase_button_color_id=globals.assigned_button_31;
                    globals.paint_button_color_id=globals.provisional_Assigned_button;
                    globals.assigned_button_31=globals.provisional_Assigned_button;
                }
                globals.assigned_button_letter_31=globals.provisional_Assigned_button_letter;
                globals.assigned_button_31=globals.provisional_Assigned_button;
                break;
            case 32:
                if(globals.provisional_Assigned_button!=globals.assigned_button_32) {
                    globals.erase_button_color_id = globals.assigned_button_32;
                    globals.paint_button_color_id = globals.provisional_Assigned_button;
                    globals.assigned_button_32 = globals.provisional_Assigned_button;
                }
                globals.assigned_button_letter_32=globals.provisional_Assigned_button_letter;
                globals.assigned_button_11=globals.provisional_Assigned_button;
                break;
            case 41:
                if(globals.provisional_Assigned_button!=globals.assigned_button_41){
                    globals.erase_button_color_id=globals.assigned_button_41;
                    globals.paint_button_color_id=globals.provisional_Assigned_button;
                    globals.assigned_button_41=globals.provisional_Assigned_button;
                }
                globals.assigned_button_letter_41=globals.provisional_Assigned_button_letter;
                globals.assigned_button_41=globals.provisional_Assigned_button;
                break;
            case 42:
                if(globals.provisional_Assigned_button!=globals.assigned_button_42){
                    globals.erase_button_color_id=globals.assigned_button_42;
                    globals.paint_button_color_id=globals.provisional_Assigned_button;
                    globals.assigned_button_42=globals.provisional_Assigned_button;
                }
                globals.assigned_button_letter_42=globals.provisional_Assigned_button_letter;
                globals.assigned_button_42=globals.provisional_Assigned_button;
                break;
            case 5:
                if(globals.provisional_Assigned_button!=globals.assigned_button_forward){
                    globals.erase_button_color_id=globals.assigned_button_forward;
                    globals.paint_button_color_id=globals.provisional_Assigned_button;
                    globals.assigned_button_forward=globals.provisional_Assigned_button;
                }
                globals.assigned_button_letter_7=globals.provisional_Assigned_button_letter;
                globals.assigned_button_forward=globals.provisional_Assigned_button;
                break;
            case 6:
                if(globals.provisional_Assigned_button!=globals.assigned_button_back){
                    globals.erase_button_color_id=globals.assigned_button_back;
                    globals.paint_button_color_id=globals.provisional_Assigned_button;
                    globals.assigned_button_back=globals.provisional_Assigned_button;
                }
                globals.assigned_button_letter_8=globals.provisional_Assigned_button_letter;
                globals.assigned_button_back=globals.provisional_Assigned_button;
                break;
            case 7:
                if(globals.provisional_Assigned_button!=globals.assigned_button_right){
                    globals.erase_button_color_id=globals.assigned_button_right;
                    globals.paint_button_color_id=globals.provisional_Assigned_button;
                    globals.assigned_button_right=globals.provisional_Assigned_button;
                }
                globals.assigned_button_letter_6=globals.provisional_Assigned_button_letter;
                globals.assigned_button_right=globals.provisional_Assigned_button;
                break;
            case 8:
                if(globals.provisional_Assigned_button!=globals.assigned_button_left){
                    globals.erase_button_color_id=globals.assigned_button_left;
                    globals.paint_button_color_id=globals.provisional_Assigned_button;
                    globals.assigned_button_left=globals.provisional_Assigned_button;
                }
                globals.assigned_button_letter_5=globals.provisional_Assigned_button_letter;
                globals.assigned_button_left=globals.provisional_Assigned_button;
                break;
        }
    }
}

