package com.example.garorasu.metro;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;

public class SplashActivity extends Activity {
    private ShimmerFrameLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView title = (TextView) findViewById(R.id.text_splash);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Nunito-Bold.ttf");
        title.setTypeface(custom_font);
    }
    @Override
    public void onStart(){
        super.onStart();
        container = (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container);
        container.startShimmerAnimation();
    }
}
