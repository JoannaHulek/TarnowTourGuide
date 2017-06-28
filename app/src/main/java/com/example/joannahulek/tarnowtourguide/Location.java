package com.example.joannahulek.tarnowtourguide;

import android.util.ArraySet;

import java.io.Serializable;

/**
 * Created by Joasia on 25.06.2017.
 */

public class Location implements Serializable {

    private final int locationNameResource;
    private final Category locationCategory;
    private final int locationImageResource;
    private final int aboutLocationResource;
    private final int locationCoordinatesResource;
    private final ArraySet<Integer> additionalImagesResources;

    public Location(int locationNameResource, Category locationCategory, int locationImageResource) {
        this.locationNameResource = locationNameResource;
        this.locationImageResource = locationImageResource;
        this.locationCategory = locationCategory;
        this.aboutLocationResource = 0;
        this.locationCoordinatesResource = 0;
        this.additionalImagesResources = null;
    }

    public Location(int locationNameResource, Category locationCategory, int locationImg, int aboutLocationResource) {
        this.locationNameResource = locationNameResource;
        this.locationImageResource = locationImg;
        this.aboutLocationResource = aboutLocationResource;
        this.locationCategory = locationCategory;
        this.locationCoordinatesResource = 0;
        this.additionalImagesResources = null;

        //, ArraySet<Integer> additionalLocationImages
        //int locationCoordinatesResource
        // additionalLocationImages
    }

    public int getLocationNameResource() {
        return locationNameResource;
    }

    public int getLocationImageResource() {
        return locationImageResource;
    }

    public Category getLocationCategory() {
        return locationCategory;
    }

    public int getAboutLocationResource() {
        return aboutLocationResource;
    }

    public int getLocationCoordinatesResource() {
        return locationCoordinatesResource;
    }

    public ArraySet<Integer> getAdditionalImagesResources() {
        return additionalImagesResources;
    }


}
