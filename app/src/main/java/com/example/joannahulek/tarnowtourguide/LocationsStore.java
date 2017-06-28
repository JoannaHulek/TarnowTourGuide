package com.example.joannahulek.tarnowtourguide;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Joasia on 27.06.2017.
 */

public class LocationsStore implements Serializable {

    private final static List<Location> LOCATIONS = Arrays.asList(
            new Location(R.string.the_main_railway_station, Category.MONUMENT, R.drawable.tarnow_dworzec1,
                    R.string.about_the_main_railway_station),
            new Location(R.string.cafe_tramwaj, Category.COFFEE_OR_RESTAURANT, R.drawable.cafe_tramwaj_tarnow1,
                    R.string.about_cafe_tramwaj),
            new Location(R.string.walowa, Category.STREET, R.drawable.tarnow_walowa1,
                    R.string.about_walowa),
            new Location(R.string.the_main_square, Category.SQUARE, R.drawable.tarnow_rynek1,
                    R.string.about_the_main_square)
    );

    private int currentPosition = 0;

    public List<Location> getLocationsArray() {
        return LOCATIONS;
    }

    public Location current(int position) {

        currentPosition = position;

        return current();
    }

    public Location current() {
        return LOCATIONS.get(currentPosition);
    }
}
