package com.joannahulek.tarnowtourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    public static final LocationsStore LOCATIONS_STORE = new LocationsStore();

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
                LOCATIONS_STORE.current(position);

                Intent i = new Intent(MainActivity.this, AboutLocationActivity.class);
                i.putExtra("locationsArray", LOCATIONS_STORE);
                startActivity(i);
            }
        });

    }


}

