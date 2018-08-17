package com.example.vfernandez.oviedotourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Load the location basic details
        Location currentLocation = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        //If the name is too long the font size gets reduced (should be dynamic in the future)
        String name = currentLocation.getName();
        if (name.length()>30){
            nameTextView.setTextSize(15);
        }
        nameTextView.setText(currentLocation.getName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.icon_view);
        if (currentLocation.hasIcon()) {
            imageView.setImageResource(currentLocation.getIcon());
            imageView.setVisibility(View.VISIBLE);
        }else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
