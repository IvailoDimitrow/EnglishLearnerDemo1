package com.example.acer.englishlearner;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivityFragmentGrammar extends AppCompatActivity {
    ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_viewpager);
        viewpager = (ViewPager) findViewById(R.id.pager);
        GrammarAdapterCausativeForm padapter = new GrammarAdapterCausativeForm(getSupportFragmentManager());
        viewpager.setAdapter(padapter);

    }



}

