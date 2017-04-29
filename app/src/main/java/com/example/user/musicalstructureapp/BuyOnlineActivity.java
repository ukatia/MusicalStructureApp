package com.example.user.musicalstructureapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Katia on 29/04/2017.
 */

public class BuyOnlineActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_online);

        Uri uri = Uri.parse("https://www.amazon.com/MP3-Music-Download/b?ie=UTF8&node=163856011");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
