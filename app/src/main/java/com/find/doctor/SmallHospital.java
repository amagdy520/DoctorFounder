package com.find.doctor;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SmallHospital extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small_hospital);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.huraymala:
                Uri gmmIntentUri = Uri.parse("google.streetview:cbll=25.1098486,46.0909536");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;
        }
    }
}
