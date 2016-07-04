package com.example.acer.englishlearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   List<StarterData> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview);
        list = new ArrayList();
        data();
        RecyclerView recView = (RecyclerView) findViewById(R.id.my_recycleview);
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
        StarterData grammar = new StarterData(R.drawable.images,"Grammar");
        list.add(grammar);
        StarterData writting = new StarterData( R.drawable.images,"Writting");
        list.add(writting);
        StarterData dictionary = new StarterData( R.drawable.images,"Dictionary");
        list.add(dictionary);
    }
}



