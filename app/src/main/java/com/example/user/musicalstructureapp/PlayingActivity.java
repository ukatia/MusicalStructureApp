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

public class PlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        //Find view that shows Playlists button
        Button playlists = (Button) findViewById(R.id.btnPlaylists);

        //Set a clicklistener on that button
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Playlists button is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(PlayingActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        //Find view that shows Albums button
        Button albums = (Button) findViewById(R.id.btnAlbums);

        //Set a clicklistener on that button
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Albums button clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(PlayingActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        //Find view that shows Artists button
        Button artists = (Button) findViewById(R.id.btnArtists);

        //Set a clicklistener on that button
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Artists button is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(PlayingActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        //Find home imageButton
        ImageButton home = (ImageButton) findViewById(R.id.btnHome);

        //Set a clicklistener on that button
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(PlayingActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
