package com.example.stoukenn2;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;

//ここではグローバルに使う変数を記述するアプリケーション間で遷移したい変数はここで参照され実質的に遷移することになる
public class Globals extends Application {
    public static Context globalContext;
    //グローバルに使う変数
    String collarButton1="#ED90BA";
    String collarButton2="#F54275";
    String collarButton3="#C7B83C";
    String collarButton4="#AFA690";
    int collarButton_assigned_number_1=14;
    int collarButton_assigned_number_2=25;
    int collarButton_assigned_number_3=33;
    int collarButton_assigned_number_4=41;
    int assigned_button_number=0;
    int provisional_Assigned_button=0;
    String provisional_Assigned_button_letter=null;
    int assigned_button_11=35;
    int assigned_button_12=0;
    int assigned_button_21=55;
    int assigned_button_22=0;
    int assigned_button_31=35;
    int assigned_button_32=0;
    int assigned_button_41=68;
    int assigned_button_42=36;
    String button_state_1_1=null;
    String button_state_1_2=null;
    String button_state_2_1=null;
    String button_state_2_2=null;
    String button_state_3_1=null;
    String button_state_3_2=null;
    String button_state_4_1=null;
    String button_state_4_2=null;
    String button_state_5=null;
    String button_state_6=null;
    String button_state_7=null;
    String button_state_8=null;
    int assigned_button_forward=73;//5
    int assigned_button_back=74;//6
    int assigned_button_right=75;//7
    int assigned_button_left=76;//8
    int erase_button_color_id=0;
    int paint_button_color_id=0;
    String assigned_button_letter_11="N";
    String assigned_button_letter_12=null;
    String assigned_button_letter_21="shift";
    String assigned_button_letter_22=null;
    String assigned_button_letter_31="U";
    String assigned_button_letter_32=null;
    String assigned_button_letter_41="i";
    String assigned_button_letter_42="ctrl";
    String assigned_button_letter_5="→";
    String assigned_button_letter_6="←";
    String assigned_button_letter_7="↑";
    String assigned_button_letter_8="↓";
    String[] Data= {"a","b","c","d","a","b","c","d","o","o"};
    public void GlobalsAllInit(){//初期化用関数
        String collarButton1=null;
        String collarButton2=null;
        String collarButton3=null;
        String collarButton4=null;

    }
}
