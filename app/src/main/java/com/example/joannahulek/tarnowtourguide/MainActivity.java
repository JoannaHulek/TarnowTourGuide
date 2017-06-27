package com.example.joannahulek.tarnowtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final static List<Location> LOCATIONS = Arrays.asList(
            new Location("Dworzec PKP", Category.MONUMENT, R.drawable.tarnow_dworzec1),
            new Location("Cafe Tramwaj", Category.COFFEE_OR_RESTAURANT, R.drawable.cafe_tramwaj_tarnow1),
            new Location("Wałowa", Category.STREET, R.drawable.tarnow_walowa1),
            new Location("Rynek", Category.SQUARE, R.drawable.tarnow_rynek1)
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LocationAdapter adapter = new LocationAdapter(this, LOCATIONS);

        GridView menuGridView = (GridView) findViewById(R.id.menu);

        menuGridView.setAdapter(adapter);

        menuGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Location location = LOCATIONS.get(position);


            }
        });

    }


}

