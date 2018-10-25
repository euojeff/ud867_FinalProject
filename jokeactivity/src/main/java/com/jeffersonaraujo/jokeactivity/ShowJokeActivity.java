package com.jeffersonaraujo.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ShowJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}