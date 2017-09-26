package com.joannahulek.tarnowtourguide;

import com.joannahulek.tarnowtourguide.R;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Joasia on 27.06.2017.
 */

public class LocationsStore implements Serializable {

    private final static List<Location> LOCATIONS = Arrays.asList(
            new Location(R.string.the_main_railway_station, Category.MONUMENT, R.drawable.tarnow_dworzec1,
                    R.string.about_the_main_railway_station,
                    "https://pl.wikipedia.org/wiki/Tarn%C3%B3w_(stacja_kolejowa)",
                    new HashSet<>(Arrays.asList(R.drawable.dworzec2, R.drawable.dworzec3, R.drawable.dworzec4, R.drawable.dworzec5)),
                    "50.005626,20.974686"),
            new Location(R.string.etno_museum, Category.MUSEUM, R.drawable.muzeum_etnograf_tarnow1,
                    R.string.about_etno_museum,
                    "http://www.odkryjmalopolske.pl/muzeum-etnograficzne-w-tarnowie.html",
                    new HashSet<>(Arrays.asList(R.drawable.etno1, R.drawable.etno2, R.drawable.etno3, R.drawable.etno4)),
                    "50.010993,20.983231"),
            new Location(R.string.cafe_tramwaj, Category.COFFEE_OR_RESTAURANT, R.drawable.cafe_tramwaj_tarnow1,
                    R.string.about_cafe_tramwaj,
                    "https://www.facebook.com/pg/CafeTramwaj/about/?ref=page_internal",
                    new HashSet<>(Arrays.asList(R.drawable.cafe_tramwaj2, R.drawable.cafe_tramwaj3, R.drawable.cafe_tramwaj4, R.drawable.cafe_tramwaj5)),
                    "50.012097,20.985363"),
            new Location(R.string.walowa, Category.STREET, R.drawable.tarnow_walowa1,
                    R.string.about_walowa,
                    "https://pl.wikipedia.org/wiki/Ulica_Wa%C5%82owa_w_Tarnowie",
                    new HashSet<>(Arrays.asList(R.drawable.walowa1, R.drawable.walowa2, R.drawable.walowa3, R.drawable.walowa4, R.drawable.walowa5)),
                    "50.013348,20.986270"),
            new Location(R.string.the_main_square, Category.SQUARE, R.drawable.tarnow_rynek1,
                    R.string.about_the_main_square,
                    "https://pl.wikipedia.org/wiki/Rynek_w_Tarnowie",
                    new HashSet<>(Arrays.asList(R.drawable.rynek2, R.drawable.rynek3, R.drawable.rynek4, R.drawable.rynek5)),
                    "50.012190,20.988092"),
            new Location(R.string.park_strzelecki, Category.PARK, R.drawable.park_strzelecki1,
                    R.string.about_park_strzelecki,
                    "https://pl.wikipedia.org/wiki/Park_Strzelecki_w_Tarnowie",
                    new HashSet<>(Arrays.asList(R.drawable.park_strzelecki1b, R.drawable.park_strzelecki2, R.drawable.park_strzelecki2b, R.drawable.park_strzelecki3, R.drawable.park_strzelecki3c, R.drawable.park_strzelecki4, R.drawable.park_strzelecki5, R.drawable.park_strzelecki6, R.drawable.park_strzelecki7, R.drawable.park_strzelecki8)),
                    "50.019340,20.985184")
    );

    private int currentPosition = 0;

    public List<Location> getLocationsArray() {
        return LOCATIONS;
    }

    public Location current(int position) {
        currentPosition = position;
        return current();
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public Location current() {
        return LOCATIONS.get(currentPosition);
    }
}
