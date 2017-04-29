package com.example.user.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find view that shows Playing now - Song details category
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);

        //Set a clicklistener on that view
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the  Playing now - Song details View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        //Find view that shows Albums category
        TextView albums = (TextView) findViewById(R.id.albums);

        //Set a clicklistener on that view
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Albums View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        //Find view that shows Playlists category
        TextView playlists = (TextView) findViewById(R.id.playlists);

        //Set a clicklistener on that view
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Playlists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        //Find view that shows Artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        //Set a clicklistener on that view
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Artists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        //Find view that shows Search music library category
        TextView search = (TextView) findViewById(R.id.search);

        //Set a clicklistener on that view
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Search music library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        //Find view that shows Buy online category
        TextView buy_online = (TextView) findViewById(R.id.buy_online);

        //Set a clicklistener on that view
        buy_online.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Buy online View is clicked on.
            @Override
            public void onClick(View view) {
                Intent buy_onlineIntent = new Intent(MainActivity.this, BuyOnlineActivity.class);
                startActivity(buy_onlineIntent);
            }
        });
    }
}
