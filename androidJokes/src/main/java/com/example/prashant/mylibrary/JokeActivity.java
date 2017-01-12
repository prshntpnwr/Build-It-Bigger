package com.example.prashant.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static String JOKE_KEY = "Joke key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();

        if (intent != null) {
            String joke = intent.getStringExtra(JOKE_KEY);
            TextView jokeTextView = (TextView) findViewById(R.id.joke_textview);
            if (joke != null && joke.length() != 0) {
                jokeTextView.setText(joke);
            }
        }
    }
}