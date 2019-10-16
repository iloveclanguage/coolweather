package com.example.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainActivity -onCreate - - - ->", "----------------------------------------");
        super.onCreate(savedInstanceState);
        Log.d("MainActivity -onCreate - - - ->", " -----1");
        setContentView(R.layout.activity_main);
        Log.d("MainActivity -onCreate - - - ->", " -----2");
        //TODO DUAN
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather", null) != null) {
            Log.d("MainActivity -onCreate - - - ->", " -----3");
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            Log.d("MainActivity -onCreate - - - ->", " -----4");
            finish();
            Log.d("MainActivity -onCreate - - - ->", " -----5");
        }
    }
}
