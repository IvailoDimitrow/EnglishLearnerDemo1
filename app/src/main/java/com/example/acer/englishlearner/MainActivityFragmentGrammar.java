package com.example.acer.englishlearner;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.graphics.Typeface;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

