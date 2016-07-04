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
public class WrittingAdapter extends RecyclerView.Adapter<WrittingAdapter.WrittingHolder>
{
    List<WrittingData> things;
    public WrittingAdapter(List<WrittingData> things){
        this.things = things;
    }

    @Override
    public WrittingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.writting_activity, parent, false);
        return new WrittingHolder(v);
    }
    @Override
    public void onBindViewHolder(WrittingHolder holder, int position) {
        WrittingData starter = things.get(position);
        holder.text1.setText(starter.textWritting);
        holder.image1.setImageResource(starter.imageWritting);
    }
    @Override
    public int getItemCount() {
        return things.size();
    }

    class WrittingHolder extends RecyclerView.ViewHolder{
        TextView text1;
        ImageView image1;
        public WrittingHolder(View itemView) {
            super(itemView);
            text1 = (TextView) itemView.findViewById(R.id.writting_text);
            image1 = (ImageView) itemView.findViewById(R.id.writting_image);
        }
    }
}
