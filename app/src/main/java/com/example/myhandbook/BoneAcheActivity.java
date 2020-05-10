package com.example.myhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class BoneAcheActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boneache);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void onClickBoneAcheReasons(View view){
        Intent reasons = new Intent(BoneAcheActivity.this,BoneAche_reasons.class);
        startActivity(reasons);
    }
    public void onClickBoneAcheCharacter(View view){
        Intent character = new Intent(BoneAcheActivity.this,BoneAche_character.class);
        startActivity(character);
    }
    public void onClickBoneAcheHealing(View view){
        Intent healing = new Intent(BoneAcheActivity.this,BoneAche_healing.class);
        startActivity(healing);
    }
}
