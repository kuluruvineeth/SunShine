package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mWeatherForDay;
    private String mForecast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        Intent intentThatStartedThisActivity = getIntent();
        if(intentThatStartedThisActivity!=null){
            if(intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){
                mForecast = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);
                Log.v(FORECAST_SHARE_HASHTAG,mForecast);
                mWeatherForDay.setText(mForecast);
            }
        }

    }
}