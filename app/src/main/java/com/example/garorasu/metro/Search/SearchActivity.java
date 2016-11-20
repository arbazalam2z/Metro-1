package com.example.garorasu.metro.Search;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;


import com.example.garorasu.metro.R;

public class SearchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        if (findViewById(R.id.fragment_container) != null) {
            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }
            // Create a new Fragment to be placed in the activity layout
            StationSelectionFragment stationSelectionFragment = new StationSelectionFragment();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().add(R.id.fragment_container,stationSelectionFragment).commit();

        }
    }
}
