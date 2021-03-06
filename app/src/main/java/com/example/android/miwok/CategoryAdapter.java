package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by AJAY OMKAR on 13-Dec-16.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new NumbersFragment();
        else if(position == 1)
            return new ColorsFragment();
        else if(position == 2)
            return new FamilyFragment();
        else
        return new PhrasesFragment();

    }

    @Override
    public int getCount() {
        return 4;
    }
}
