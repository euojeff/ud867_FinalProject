package com.jeffersonaraujo.jokeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowJokeActivity extends AppCompatActivity {

    TextView jokeTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        jokeTV = findViewById(R.id.tv_joke);

        jokeTV.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT));

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
