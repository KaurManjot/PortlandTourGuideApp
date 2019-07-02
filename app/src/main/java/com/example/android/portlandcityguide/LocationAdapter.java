package com.example.android.portlandcityguide;

import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/*
 Adapter class takes the data and creates view for each item in RecyclerView
  */
public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.ViewHolder> {

    private List<Location> locationList;
    private Fragment fragment;

    public LocationAdapter(Fragment fragment, List<Location> locationList) {
        this.fragment = fragment;
        this.locationList = locationList;
    }

    /*
    Inflate the layout that a RecyclerView will hold, then pass it to ViewHolder and return
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(fragment.getContext());
        View view = inflater.inflate(R.layout.location, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    /*
    Gets the ViewHolder created in onCreateViewHolder() and set it on the location layout
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Location location = locationList.get(position);
        holder.image.setImageResource(location.getImage());
        holder.name.setText(location.getName());
        holder.streetAddress.setText(location.getStreetAddress());
        holder.visitingHours.setText(location.getVisitingHours());
        holder.rating.setRating(location.getRating());
    }

    /*
    Count of locations RecyclerView holds
     */
    @Override
    public int getItemCount() {
        return locationList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name;
        TextView streetAddress;
        TextView visitingHours;
        RatingBar rating;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.location_image);
            name = itemView.findViewById(R.id.location_name);
            streetAddress = itemView.findViewById(R.id.location_street_address);
            visitingHours = itemView.findViewById(R.id.location_visiting_hours);
            rating = itemView.findViewById(R.id.location_rating);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }
}

