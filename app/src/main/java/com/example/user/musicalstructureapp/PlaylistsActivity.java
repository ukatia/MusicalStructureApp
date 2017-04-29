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

public class PlaylistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        //Find view that shows Now Playing button
        Button playing = (Button) findViewById(R.id.btnNowPlaying);

        //Set a clicklistener on that button
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing button is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(PlaylistsActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        //Find view that shows Albums button
        Button albums = (Button) findViewById(R.id.btnAlbums);

        //Set a clicklistener on that button
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Albums button is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(PlaylistsActivity.this, AlbumsActivity.class);
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
                Intent artistsIntent = new Intent(PlaylistsActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        //Find view that shows Search music library button
        Button search = (Button) findViewById(R.id.btnSearch);

        //Set a clicklistener on that button
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the  Search music library button is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(PlaylistsActivity.this, SearchActivity.class);
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
                Intent mainIntent = new Intent(PlaylistsActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
