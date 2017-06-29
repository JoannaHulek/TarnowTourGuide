package com.example.joannahulek.tarnowtourguide;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by Joasia on 25.06.2017.
 */

public class Location implements Serializable {

    private final int locationNameResource;
    private final Category locationCategory;
    private final int locationImageResource;
    private final int aboutLocationResource;
    private final String aboutTextSource;
    private final String locationCoordinates;
    private final Set<Integer> additionalImagesResources;


    public Location(int locationNameResource, Category locationCategory, int locationImg, int aboutLocationResource, String aboutTextSource, Set<Integer> additionalLocationImages, String locationCoordinates) {
        this.locationNameResource = locationNameResource;
        this.locationCategory = locationCategory;
        this.locationImageResource = locationImg;
        this.aboutLocationResource = aboutLocationResource;
        this.aboutTextSource = aboutTextSource;
        this.additionalImagesResources = additionalLocationImages;
        this.locationCoordinates = locationCoordinates;

    }

    public int getLocationNameResource() {
        return locationNameResource;
    }

    public Category getLocationCategory() {
        return locationCategory;
    }

    public int getLocationImageResource() {
        return locationImageResource;
    }

    public int getAboutLocationResource() {
        return aboutLocationResource;
    }

    public String getAboutTextSource() {
        return aboutTextSource;
    }

    public String getLocationCoordinates() {
        return locationCoordinates;
    }

    public Set<Integer> getAdditionalImagesResources() {
        return additionalImagesResources;
    }

}
