package com.joannahulek.tarnowtourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.joannahulek.tarnowtourguide.R;

/**
 * Created by Joasia on 27.06.2017.
 */

public class AboutLocationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_about_location, container, false);
        final Location currentLocation = (Location) getArguments().getSerializable("location");

        ImageView locationImage = (ImageView) rootView.findViewById(R.id.location_image);
        TextView locationNameTextView = (TextView) rootView.findViewById(R.id.location_name_text_view);
        TextView locationCategoryTextView = (TextView) rootView.findViewById(R.id.location_category_text_view);
        TextView aboutLocationTextView = (TextView) rootView.findViewById(R.id.about_location_text_view);
        TextView aboutTextSourceTextView = (TextView) rootView.findViewById(R.id.about_text_source);
        HorizontalScrollView galleryHSV = (HorizontalScrollView) rootView.findViewById(R.id.gallery_shv);
        Button findOnMapButton = (Button) rootView.findViewById(R.id.find_on_map_button);


        locationImage.setImageResource(currentLocation.getLocationImageResource());

        locationNameTextView.setText(currentLocation.getLocationNameResource());

        locationCategoryTextView.setText(currentLocation.getLocationCategory().getDisplayText());

        aboutLocationTextView.setText(currentLocation.getAboutLocationResource());

        aboutTextSourceTextView.setText(getString(R.string.source) + currentLocation.getAboutTextSource());
        aboutTextSourceTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = currentLocation.getAboutTextSource();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        fillGallery(currentLocation, galleryHSV);

        findOnMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.streetview:cbll=" + currentLocation.getLocationCoordinates());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        return rootView;
    }

    private void fillGallery(Location currentLocation, HorizontalScrollView gallery) {
        LinearLayout wrappingLayout = new LinearLayout(getContext());
        for (Integer integer : currentLocation.getAdditionalImagesResources()) {
            wrappingLayout.addView(createPhotoForId(integer));
        }
        gallery.addView(wrappingLayout);
    }

    @NonNull
    private View createPhotoForId(Integer integer) {
        ImageView galleryPhoto = new ImageView(getContext());
        galleryPhoto.setImageResource(integer);
        galleryPhoto.setPadding(8, 8, 8, 8);
        return galleryPhoto;
    }

}