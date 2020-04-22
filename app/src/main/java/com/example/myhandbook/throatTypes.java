package com.example.myhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class throatTypes extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_throattypes);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void onClickFirstThroatType(View view){
        Intent throatTypes = new Intent(throatTypes.this,throattypes_first.class);
        startActivity(throatTypes);
    }
    public void onClickSecondThroatType(View view){
        Intent throatTypes = new Intent(throatTypes.this,throattypes_second.class);
        startActivity(throatTypes);
    }
    public void onClickThirdThroatType(View view){
        Intent throatTypes = new Intent(throatTypes.this,throattypes_third.class);
        startActivity(throatTypes);
    }
    public void onClickFourthThroatType(View view){
        Intent throatTypes = new Intent(throatTypes.this,throattypes_fourth.class);
        startActivity(throatTypes);
    }
    public void onClickFifthThroatType(View view){
        Intent throatTypes = new Intent(throatTypes.this,throattypes_fifth.class);
        startActivity(throatTypes);
    }
}
