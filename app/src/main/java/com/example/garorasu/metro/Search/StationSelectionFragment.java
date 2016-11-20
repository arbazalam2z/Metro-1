package com.example.garorasu.metro.Search;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.garorasu.metro.R;


public class StationSelectionFragment extends Fragment {
    private RecyclerView recycler_blue_line,recycler_yellow_line,recycler_red_line;
    private  BlueLineRecyclerAdapter blueLineRecyclerAdapter;
    private  YellowLineRecyclerAdapter yellowLineRecyclerAdapter;
    private  RedLineRecyclerAdapter redLineRecyclerAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_station_selection, container, false);

        // Inflate the layout for this fragment
        recycler_blue_line = (RecyclerView) view.findViewById(R.id.recycler_blue_line);
        recycler_yellow_line = (RecyclerView) view.findViewById(R.id.recycler_yellow_line);
        recycler_red_line = (RecyclerView) view.findViewById(R.id.recycler_red_line);
        fillUI();
        return view;
    }
    public void fillUI(){
        LinearLayoutManager layoutManager1
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        blueLineRecyclerAdapter = new BlueLineRecyclerAdapter();
        recycler_blue_line.setLayoutManager(layoutManager1);
        recycler_blue_line.setHasFixedSize(true);
        recycler_blue_line.setItemAnimator(new DefaultItemAnimator());
        recycler_blue_line.setAdapter(blueLineRecyclerAdapter);

        LinearLayoutManager layoutManager2
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        yellowLineRecyclerAdapter = new YellowLineRecyclerAdapter();
        recycler_yellow_line.setLayoutManager(layoutManager2);
        recycler_yellow_line.setHasFixedSize(true);
        recycler_yellow_line.setItemAnimator(new DefaultItemAnimator());
        recycler_yellow_line.setAdapter(yellowLineRecyclerAdapter);

        LinearLayoutManager layoutManager3
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        redLineRecyclerAdapter = new RedLineRecyclerAdapter();
        recycler_red_line.setLayoutManager(layoutManager3);
        recycler_red_line.setHasFixedSize(true);
        recycler_red_line.setItemAnimator(new DefaultItemAnimator());
        recycler_red_line.setAdapter(redLineRecyclerAdapter);
    }
}
