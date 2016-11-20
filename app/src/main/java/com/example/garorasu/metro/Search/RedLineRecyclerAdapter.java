package com.example.garorasu.metro.Search;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.garorasu.metro.R;

/**
 * Created by garorasu on 20/11/16.
 */
public class RedLineRecyclerAdapter extends RecyclerView.Adapter<RedLineRecyclerAdapter.ViewHolder> {
    private String[] mRedLineStationList = {"Bus Stand","Camp Chowk","Nagori Gate","Red Light"};


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.station_adapter_red_card, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String station = mRedLineStationList[position];
        holder.mStation.setText(station);
    }

    @Override
    public int getItemCount() {
        return mRedLineStationList.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mStation;
        public ViewHolder(final View itemView) {
            super(itemView);
            mStation = (TextView) itemView.findViewById(R.id.text_red_adapter);
            Typeface custom_font = Typeface.createFromAsset(mStation.getContext().getAssets(),  "fonts/Nunito-Bold.ttf");
            mStation.setTypeface(custom_font);
        }
    }
}

