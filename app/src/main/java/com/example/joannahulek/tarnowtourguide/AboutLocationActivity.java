package com.example.joannahulek.tarnowtourguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AboutLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_location);


        Bundle savedData = getIntent().getExtras();
        final LocationsStore locationsStore = (LocationsStore) savedData.getSerializable("locationsArray");
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        AboutLocationFragmentPagerAdapter adapter = new AboutLocationFragmentPagerAdapter(getSupportFragmentManager(), locationsStore.getLocationsArray());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

/*
        final Location currentLocation = LOCATIONS_STORE.current();

        ImageView locationImage = (ImageView) findViewById(R.id.location_image);
        TextView locationNameTextView = (TextView) findViewById(R.id.location_name_text_view);
        TextView locationCategoryTextView = (TextView) findViewById(R.id.location_category_text_view);
        TextView aboutLocationTextView = (TextView) findViewById(R.id.about_location_text_view);

        locationImage.setImageResource(currentLocation.getLocationImageResource());
        locationNameTextView.setText(currentLocation.getLocationNameResource());
        locationCategoryTextView.setText(currentLocation.getLocationCategory().getDisplayText());
        aboutLocationTextView.setText(currentLocation.getAboutLocationResource());*/

        Button upToMenuButton = (Button) findViewById(R.id.up_to_menu_button);
        final Context context = this;
        upToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
