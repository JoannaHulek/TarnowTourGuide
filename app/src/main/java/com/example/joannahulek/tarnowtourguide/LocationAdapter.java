package com.example.joannahulek.tarnowtourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Joasia on 25.06.2017.
 */
public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(@NonNull Context context, @NonNull List<Location> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View menuItemView = convertView;
        if (menuItemView == null) {
            menuItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.menu_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView locationNameTextView = (TextView) menuItemView.findViewById(R.id.location_name_text_view);
        locationNameTextView.setText(currentLocation.getLocationNameResource());

        TextView locationCategoryTextView = (TextView) menuItemView.findViewById(R.id.location_category_text_view);
        locationCategoryTextView.setText(currentLocation.getLocationCategory().getDisplayText());

        ImageView locationImageView = (ImageView) menuItemView.findViewById(R.id.location_image);
        locationImageView.setImageResource(currentLocation.getLocationImageResource());

        return menuItemView;
    }
}
