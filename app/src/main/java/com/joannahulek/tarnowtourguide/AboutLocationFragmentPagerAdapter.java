package com.joannahulek.tarnowtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Joasia on 28.06.2017.
 */

public class AboutLocationFragmentPagerAdapter extends FragmentPagerAdapter {
    private final List<Location> locations;

    public AboutLocationFragmentPagerAdapter(FragmentManager fm, List<Location> locations) {
        super(fm);
        this.locations = locations;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("location", locations.get(position));
        AboutLocationFragment aboutLocationFragment = new AboutLocationFragment();
        aboutLocationFragment.setArguments(bundle);
        return aboutLocationFragment;
    }

    @Override
    public int getCount() {
        return locations.size();
    }
}
