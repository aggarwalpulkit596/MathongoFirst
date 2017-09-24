package com.learnacad.learnacad.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.learnacad.learnacad.Fragments.LPLectureTabFragment;

/**
 * Created by Sahil Malhotra on 09-07-2017.
 */

public class LecturePlayerViewPagerAdapter extends FragmentPagerAdapter {

    public LecturePlayerViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {

        return new LPLectureTabFragment();
    }



    @Override
    public int getCount() {
        return 1;
    }
}
