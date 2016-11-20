package com.example.garorasu.metro;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textSearchCard = (TextView) findViewById(R.id.text_search_card);
        TextView textNearestCard = (TextView) findViewById(R.id.text_nearest_card);
        TextView textStationCard = (TextView) findViewById(R.id.text_station_card);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Nunito-Bold.ttf");
        textSearchCard.setTypeface(custom_font);
        textNearestCard.setTypeface(custom_font);
        textStationCard.setTypeface(custom_font);
    }
}
