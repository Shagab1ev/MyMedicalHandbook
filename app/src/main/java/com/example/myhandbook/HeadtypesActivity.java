package com.example.myhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class HeadtypesActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headtypes);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void onClickFirstType(View view){
        Intent first = new Intent(HeadtypesActivity.this,headtypes_first.class);
        startActivity(first);
    }
    public void onClickSecondType(View view){
        Intent second = new Intent(HeadtypesActivity.this,headtypes_second.class);
        startActivity(second);
    }
    public void onClickThirdType(View view){
        Intent third = new Intent(HeadtypesActivity.this,headtypes_third.class);
        startActivity(third);
    }
    public void onClickFourthType(View view){
        Intent fourth = new Intent(HeadtypesActivity.this,headtypes_fourth.class);
        startActivity(fourth);
    }
    public void onClickFifthType(View view){
        Intent fifth = new Intent(HeadtypesActivity.this,headtypes_fifth.class);
        startActivity(fifth);
    }
    public void onClickSixthType(View view){
        Intent sixth = new Intent(HeadtypesActivity.this,headtypes_sixth.class);
        startActivity(sixth);
    }
    public void onClickSeventhType(View view){
        Intent seventh = new Intent(HeadtypesActivity.this,headtypes_seventh.class);
        startActivity(seventh);
    }
    public void onClickEighthType(View view){
        Intent eighth = new Intent(HeadtypesActivity.this,headtypes_eighth.class);
        startActivity(eighth);
    }
}
