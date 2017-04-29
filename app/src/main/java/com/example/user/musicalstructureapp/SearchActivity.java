package com.example.user.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Katia on 29/04/2017.
 */

public class SearchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //Find search button
        Button search = (Button) findViewById(R.id.searchBtn);

        //Set a clicklistener on that button
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Artists button is clicked on.
            @Override
            public void onClick(View view) {
                EditText searchText = (EditText) findViewById(R.id.searchText);
                Toast.makeText(getApplicationContext(),
                        getResources().getString(R.string.search) + " " + searchText.getText().toString() + "\n"
                                + getResources().getString(R.string.results), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
