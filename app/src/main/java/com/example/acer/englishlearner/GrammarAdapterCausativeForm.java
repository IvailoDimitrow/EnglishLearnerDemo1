package com.example.acer.englishlearner;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by VS-PC on 7/4/2016.
 */
public class GrammarAdapterCausativeForm extends FragmentPagerAdapter {
    public GrammarAdapterCausativeForm(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int arg0) {

        switch (arg0) {
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentOne();

            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }


}

