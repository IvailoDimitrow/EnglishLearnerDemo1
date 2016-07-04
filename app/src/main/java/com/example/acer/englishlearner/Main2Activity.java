package com.example.acer.englishlearner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
     List<StarterData> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grammar_activity);
        list = new ArrayList();
        data();
        RecyclerView recView = (RecyclerView) findViewById(R.id.recview2);
        recView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        if(position == 1){

                        }
                        if(position == 2){

                        }
                        if (position == 3){

                        }
                    }
                })
        );
        StarterAdapter adapter = new StarterAdapter(list);
        recView.setAdapter(adapter);
        recView.setLayoutManager(new LinearLayoutManager(this));
    }
    public void data(){
        StarterData causative = new StarterData( R.drawable.leaf,"Causative form");
        list.add(causative);
        StarterData passive = new StarterData( R.drawable.leaf,"Passive");
        list.add(passive);
        StarterData modalVerbs = new StarterData( R.drawable.leaf,"Modal Verbs");
        list.add(modalVerbs);
    }
}



