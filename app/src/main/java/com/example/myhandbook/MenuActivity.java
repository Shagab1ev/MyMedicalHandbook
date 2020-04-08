package com.example.myhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void onClickHead(View view){
        Intent headache = new Intent(MenuActivity.this,HeadacheActivity.class);
        startActivity(headache);
    }
    public void onClickThroat(View view){
        Intent throat = new Intent(MenuActivity.this,ThroatActivity.class);
        startActivity(throat);
    }
    public void onClickStomach(View view){
        Intent stomach = new Intent(MenuActivity.this,StomachActivity.class);
        startActivity(stomach);
    }
}
