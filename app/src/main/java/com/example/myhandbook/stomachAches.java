package com.example.myhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class stomachAches extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stomachaches);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void first_stomach_ache(View view){
        Intent first = new Intent(stomachAches.this,first_stomach_ache.class);
        startActivity(first);
    }
    public void second_stomach_ache(View view){
        Intent second = new Intent(stomachAches.this,second_stomach_ache.class);
        startActivity(second);
    }
    public void third_stomach_ache(View view){
        Intent third = new Intent(stomachAches.this,third_stomach_ache.class);
        startActivity(third);
    }
    public void fourth_stomach_ache(View view){
        Intent fourth = new Intent(stomachAches.this,fourth_stomach_ache.class);
        startActivity(fourth);
    }
    public void fifth_stomach_ache(View view){
        Intent fifth = new Intent(stomachAches.this,fifth_stomach_ache.class);
        startActivity(fifth);
    }
    public void sixth_stomach_ache(View view){
        Intent sixth = new Intent(stomachAches.this,sixth_stomach_ache.class);
        startActivity(sixth);
    }
}
