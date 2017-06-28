package com.example.joannahulek.tarnowtourguide;

/**
 * Created by Joasia on 25.06.2017.
 */

enum Category {
    STREET(R.string.street),
    MONUMENT(R.string.monument),
    PARK(R.string.park),
    SQUARE(R.string.square),
    COFFEE_OR_RESTAURANT(R.string.coffee_or_restaurant),
    MONUMENT_OF_NATURE(R.string.monument_of_nature),
    ENTERTAINMENT(R.string.entertaiment),
    ACCOMMODATION(R.string.accommodation),
    CITY(R.string.city);

    private final int displayText;

    Category(int alternativeText) {
        this.displayText = alternativeText;
    }

    public int getDisplayText() {
        return displayText;
    }
}
