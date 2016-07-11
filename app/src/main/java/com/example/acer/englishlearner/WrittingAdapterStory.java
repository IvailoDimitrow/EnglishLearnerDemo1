package com.example.acer.englishlearner;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WrittingAdapterStory extends FragmentPagerAdapter {
    public WrittingAdapterStory(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int arg0) {

        switch (arg0) {
            case 0:
                return new FragmentOneWritting();
            case 1:
                return new FragmentTwoWritting();
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }


}
