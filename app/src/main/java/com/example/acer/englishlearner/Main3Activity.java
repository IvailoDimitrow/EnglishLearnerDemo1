package com.example.acer.englishlearner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
     List<StarterData> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        list = new ArrayList();
        data();
        RecyclerView recView = (RecyclerView) findViewById(R.id.recview3);

        recView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        if(position == 0){
                            Intent intent = new Intent(Main3Activity.this, MainActivityFragmentGrammar.class);
                            startActivity(intent);
                        }
                        if(position == 1){
                            Intent intent = new Intent(Main3Activity.this, MainActivityFragmentWritting.class);
                            startActivity(intent);
                        }

                    }
                })
        );
        StarterAdapter adapter = new StarterAdapter(list);
        recView.setAdapter(adapter);
        recView.setLayoutManager(new LinearLayoutManager(this));
    }
    public void data(){
        StarterData essay = new StarterData( R.drawable.leaf3,"Essay");
        list.add(essay);
        StarterData story = new StarterData( R.drawable.leaf3,"Story");
        list.add(story);
    }
}

