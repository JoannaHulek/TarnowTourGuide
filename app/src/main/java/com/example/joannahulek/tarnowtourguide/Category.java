package com.example.joannahulek.tarnowtourguide;

/**
 * Created by Joasia on 25.06.2017.
 */

enum Category {
    STREET("Ulica"),
    MONUMENT("Zabytek"),
    PARK("Park"),
    SQUARE("Plac"),
    COFFEE_OR_RESTAURANT("Kawiarnia/Restauracja"),
    MONUMENT_OF_NATURE("Pomnik Przyrody"),
    ENTERTAINMENT("Rozrywka"),
    ACCOMMODATION("Zakwaterowanie"),
    CITY("Miasto");

    private final String displayText;

    Category(String alternativeText) {
        this.displayText = alternativeText;
    }

    Category() {
        this.displayText = this.name();
    }

    public String getDisplayText() {
        return displayText;
    }
}
