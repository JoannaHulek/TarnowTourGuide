package com.joannahulek.tarnowtourguide;

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

        AboutLocationFragmentPagerAdapter adapter = new AboutLocationFragmentPagerAdapter(getSupportFragmentManager(), locationsStore.getLocationsArray());

        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(locationsStore.getCurrentPosition());

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
