package com.find.doctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Custom extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.surgary:
                Intent intent = new Intent(Custom.this,ListOfDoctors.class);
                startActivity(intent);
                break;
            case R.id.eye:
                break;
            case R.id.bone:
                break;
            case R.id.brain:
                break;
            case R.id.heart:
                break;
            case R.id.stomach:
                break;
            case R.id.nose:
                break;
            case R.id.tooth:
                break;
            case R.id.radiology:
                break;
        }
    }
}
