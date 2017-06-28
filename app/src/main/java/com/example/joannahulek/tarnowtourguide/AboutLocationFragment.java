package com.example.joannahulek.tarnowtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Joasia on 27.06.2017.
 */

public class AboutLocationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_about_location, container, false);
        Location currentLocation = (Location) getArguments().getSerializable("location");

        ImageView locationImage = (ImageView) rootView.findViewById(R.id.location_image);
        TextView locationNameTextView = (TextView) rootView.findViewById(R.id.location_name_text_view);
        TextView locationCategoryTextView = (TextView) rootView.findViewById(R.id.location_category_text_view);
        TextView aboutLocationTextView = (TextView) rootView.findViewById(R.id.about_location_text_view);

        locationImage.setImageResource(currentLocation.getLocationImageResource());
        locationNameTextView.setText(currentLocation.getLocationNameResource());
        locationCategoryTextView.setText(currentLocation.getLocationCategory().getDisplayText());
        aboutLocationTextView.setText(currentLocation.getAboutLocationResource());

        return rootView;
    }

}