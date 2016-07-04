package com.example.acer.englishlearner;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Acer on 28.6.2016 г..
 */
public class GrammarAdapter extends RecyclerView.Adapter<GrammarAdapter.ContactHolder>
{
    List<GrammarData> things;
    public GrammarAdapter(List<GrammarData> things){
        this.things = things;
    }

    @Override
    public ContactHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.grammar_singlerow, parent, false);
        return new ContactHolder(v);
    }

    @Override
    public void onBindViewHolder(ContactHolder holder, int position) {
        GrammarData starter = things.get(position);
        holder.text.setText(starter.textGrammar);
        holder.image.setImageResource(starter.imageGrammar);
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
            text = (TextView) itemView.findViewById(R.id.grammar_textview);
            image = (ImageView) itemView.findViewById(R.id.grammar_imgview);
        }
    }
}