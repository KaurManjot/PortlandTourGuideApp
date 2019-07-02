package com.example.android.portlandcityguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Attractions();
        } else if (position == 1) {
            return new Restaurants();
        } else if (position == 2) {
            return new Parks();
        } else {
            return new Markets();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return context.getString(R.string.attractions);
            case 1:
                return context.getString(R.string.restaurants);
            case 2:
                return context.getString(R.string.parks);
            case 3:
                return context.getString(R.string.markets);
            default:
                return null;
        }
    }

}
