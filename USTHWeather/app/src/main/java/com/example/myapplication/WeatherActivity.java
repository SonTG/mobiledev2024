package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        // Create a new Fragment to be placed in the activity l
        ForecastFragment firstFragment = new ForecastFragment();
        // Add the fragment to the 'container' FrameLayout

        getFragmentManager().beginTransaction().add(
        R.id.main, firstFragment).commit();
    }

    public WeatherActivity() {
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather", "onStart here");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather", "onStop here");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather", "onDestroy here");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather", "onPause here");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather", "onResume here");
    }
}