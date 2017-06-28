package com.example.joannahulek.tarnowtourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    public static final LocationsStore LOCATIONS_STORE = new LocationsStore();
    //private final static List<Location> LOCATIONS = LOCATIONS_STORE.getLocationsArray();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LocationAdapter adapter = new LocationAdapter(this, LOCATIONS_STORE.getLocationsArray());

        GridView menuGridView = (GridView) findViewById(R.id.menu);

        menuGridView.setAdapter(adapter);

        menuGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Location currentLocation = LOCATIONS_STORE.current(position);

                Intent i = new Intent(MainActivity.this, AboutLocationActivity.class);
                i.putExtra("locationsArray", (Serializable) LOCATIONS_STORE);
                startActivity(i);
            }
        });

    }


}

