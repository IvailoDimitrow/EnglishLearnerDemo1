package com.example.acer.englishlearner;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivityFragmentWritting extends AppCompatActivity {
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_story);
        viewpager = (ViewPager) findViewById(R.id.pager);
        WrittingAdapterStory padapter = new WrittingAdapterStory(getSupportFragmentManager());
        viewpager.setAdapter(padapter);

    }
}
