package com.example.myhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class stomachTypes extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stomachtypes);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void onClickStomachViews(View view){
        Intent views = new Intent(stomachTypes.this,stomachAches.class);
        startActivity(views);
    }
    public void onClickStomachVarieties (View view){
        Intent variety = new Intent(stomachTypes.this,stomachVariety.class);
        startActivity(variety);
    }
    public void onClickStomachSymptoms(View view){
        Intent symptoms = new Intent(stomachTypes.this,stomachSymptoms.class);
        startActivity(symptoms);
    }
    public void onClickStomachRepair(View view){
        Intent repair = new Intent(stomachTypes.this,stomachRepair.class);
        startActivity(repair);
    }
}
