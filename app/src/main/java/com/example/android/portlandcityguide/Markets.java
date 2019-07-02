package com.example.android.portlandcityguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Markets extends Fragment {
    RecyclerView recyclerView;
    LocationAdapter locationAdapter;
    ArrayList<Location> locations;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Data for CardView representing each location
        locations = new ArrayList<>();
        locations.add(new Location(R.drawable.a11, this.getResources().getString(R.string.market1), this.getResources().getString(R.string.address1), this.getResources().getString(R.string.visitingHours1), 4.0f));
        locations.add(new Location(R.drawable.a12, this.getResources().getString(R.string.market2), this.getResources().getString(R.string.address2), this.getResources().getString(R.string.visitingHours2), 4.5f));
        locations.add(new Location(R.drawable.a13, this.getResources().getString(R.string.market3), this.getResources().getString(R.string.address3), this.getResources().getString(R.string.visitingHours3), 3.5f));
        locations.add(new Location(R.drawable.a14, this.getResources().getString(R.string.market4), this.getResources().getString(R.string.address4), this.getResources().getString(R.string.visitingHours4), 5.0f));
        locations.add(new Location(R.drawable.a15, this.getResources().getString(R.string.market5), this.getResources().getString(R.string.address5), this.getResources().getString(R.string.visitingHours5), 4.5f));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        locationAdapter = new LocationAdapter(this, locations);
        View view = inflater.inflate(R.layout.location_list, container, false);

        /*
        Get the RecyclerView in location_list xml file and set the LayoutManager and Adapter
         */
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(locationAdapter);
        return view;
    }
}
