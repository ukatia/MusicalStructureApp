package com.example.user.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Katia on 29/04/2017.
 */

public class AlbumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        //Find view that shows Now Playing button
        Button playing = (Button) findViewById(R.id.btnNowPlaying);

        //Set a clicklistener on that button
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing button is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(AlbumsActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        //Find view that shows Playlists button
        Button playlists = (Button) findViewById(R.id.btnPlaylists);

        //Set a clicklistener on that button
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Playlists button is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(AlbumsActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        //Find view that shows Artists button
        Button artists = (Button) findViewById(R.id.btnArtists);

        //Set a clicklistener on that button
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Artists button is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(AlbumsActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        //Find view that shows Search music library button
        Button search = (Button) findViewById(R.id.btnSearch);

        //Set a clicklistener on that button
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Search music library button is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(AlbumsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        //Find home imageButton
        ImageButton home = (ImageButton) findViewById(R.id.btnHome);

        //Set a clicklistener on that button
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
