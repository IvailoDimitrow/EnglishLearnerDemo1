package com.example.acer.englishlearner;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StarterAdapter extends RecyclerView.Adapter<StarterAdapter.ContactHolder>
{
    List<StarterData> things;
    public StarterAdapter(List<StarterData> things){
        this.things = things;
    }

    @Override
    public ContactHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new ContactHolder(v);
    }

    @Override
    public void onBindViewHolder(StarterAdapter.ContactHolder holder, int position) {
        StarterData starter = things.get(position);
        holder.text.setText(starter.text);
        holder.image.setImageResource(starter.image);
    }




    @Override
    public int getItemCount() {
        return things.size();
    }

    class ContactHolder extends RecyclerView.ViewHolder{
        TextView text;
        ImageView image;
        public ContactHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.grammar);
            image = (ImageView) itemView.findViewById(R.id.grammar_leaf);
        }
    }
}

