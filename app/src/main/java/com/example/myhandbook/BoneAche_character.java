package com.example.myhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class BoneAche_character extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boneachecharacter);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void onClickFirstBoneCharacter(View view){
        Intent firstcharacter = new Intent(BoneAche_character.this,first_bone_character.class);
        startActivity(firstcharacter);
    }
    public void onClickSecondBoneCharacter(View view){
        Intent secondcharacter = new Intent(BoneAche_character.this,second_bone_character.class);
        startActivity(secondcharacter);
    }
    public void onClickThirdBoneCharacter(View view){
        Intent thirdcharacter = new Intent(BoneAche_character.this,third_bone_character.class);
        startActivity(thirdcharacter);
    }
}
