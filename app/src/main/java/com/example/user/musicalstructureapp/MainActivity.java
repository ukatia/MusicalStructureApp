package com.example.user.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find playing button
        Button btnPlaying = (Button) findViewById(R.id.btnPlaying);

        //Set a clicklistener on that button
        btnPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });
    }
}
