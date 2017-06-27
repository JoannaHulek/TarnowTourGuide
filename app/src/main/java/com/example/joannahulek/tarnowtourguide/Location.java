package com.example.joannahulek.tarnowtourguide;

import android.util.ArraySet;

/**
 * Created by Joasia on 25.06.2017.
 */

public class Location {

    private final String locationName;
    private final Category locationCategory;
    private final int locationImg;
    private final String aboutLocation;
    private final String locationCoordinates;
    private final ArraySet<Integer> additionalLocationImages;

    public Location(String locationName, Category locationCategory, int locationImg) {
        this.locationName = locationName;
        this.locationImg = locationImg;
        this.locationCategory = locationCategory;
        this.aboutLocation = null;
        this.locationCoordinates = null;
        this.additionalLocationImages = null;
    }

    public Location(String locationName, Category locationCategory, int locationImg, String aboutLocation, String locationCoordinates, ArraySet<Integer> additionalLocationImages) {
        this.locationName = locationName;
        this.locationImg = locationImg;
        this.aboutLocation = aboutLocation;
        this.locationCategory = locationCategory;
        this.locationCoordinates = locationCoordinates;
        this.additionalLocationImages = additionalLocationImages;
    }

    public String getLocationName() {
        return locationName;
    }

    public int getLocationImg() {
        return locationImg;
    }

    public String getAboutLocation() {
        return aboutLocation;
    }

    public Category getLocationCategory() {
        return locationCategory;
    }

    public String getLocationCoordinates() {
        return locationCoordinates;
    }

    public ArraySet<Integer> getAdditionalLocationImages() {
        return additionalLocationImages;
    }


}
