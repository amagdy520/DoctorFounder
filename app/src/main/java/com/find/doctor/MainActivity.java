package com.find.doctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TranslateAnimation anim1,anim2;
    Button mNearHospital, mStarHospital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anim1 = new TranslateAnimation(-1000f, 0f, 0f, 0f);
        anim1.setDuration(1000);
        anim2 = new TranslateAnimation(1000f, 0f, 0f, 0f);
        anim2.setDuration(1000);
        mNearHospital = (Button) findViewById(R.id.nearHospital);
        mStarHospital = (Button) findViewById(R.id.starHospital);
        mNearHospital.setAnimation(anim1);
        mNearHospital.setVisibility(View.VISIBLE);
        mStarHospital.setAnimation(anim2);
        mStarHospital.setVisibility(View.VISIBLE);
        mNearHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });
        mStarHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Custom.class);
                startActivity(intent);
            }
        });

    }
}
