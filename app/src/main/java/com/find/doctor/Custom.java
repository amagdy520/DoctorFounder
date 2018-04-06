package com.find.doctor;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Custom extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        intent = new Intent(Custom.this,ListOfDoctors.class);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.surgary:
                intent.putExtra("type","surgary");
                startActivity(intent);
                break;
            case R.id.eye:
                intent.putExtra("type","eye");
                startActivity(intent);
                break;
            case R.id.bone:
                intent.putExtra("type","bone");
                startActivity(intent);
                break;
            case R.id.brain:
                intent.putExtra("type","brain");
                startActivity(intent);
                break;
            case R.id.heart:
                intent.putExtra("type","heart");
                startActivity(intent);
                break;
            case R.id.stomach:
                intent.putExtra("type","stomach");
                startActivity(intent);
                break;
            case R.id.nose:
                intent.putExtra("type","nose");
                startActivity(intent);
                break;
            case R.id.tooth:
                intent.putExtra("type","tooth");
                startActivity(intent);
                break;
            case R.id.radiology:
                intent.putExtra("type","radiology");
                startActivity(intent);
                break;
            case R.id.huraymala:
                Uri gmmIntentUri = Uri.parse("google.streetview:cbll=25.1098486,46.0909536");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;
        }
    }
}
