package com.example.acer.englishlearner;

import android.content.Context;
import android.graphics.Typeface;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by VS-PC on 7/4/2016.
 */
public class ChoiceDragListener implements View.OnDragListener {

    private final ViewGroup container;

    public ChoiceDragListener(ViewGroup container) {
        this.container = container;
    }

    @Override
    public boolean onDrag(View v, DragEvent event) {
        switch (event.getAction()) {
            case DragEvent.ACTION_DRAG_STARTED:
                //no action necessary
                break;
            case DragEvent.ACTION_DRAG_ENTERED:

                break;
            case DragEvent.ACTION_DRAG_EXITED:

                break;
            case DragEvent.ACTION_DROP:

                //handle the dragged view being dropped over a drop view
                View view = (View) event.getLocalState();
                //view dragged item is being dropped on
                TextView dropTarget = (TextView) v;

                TextView dropped = (TextView) view;

                if(dropTarget.getText().toString().charAt(0) == dropped.getText().toString().charAt(0))
                {

                    view.setVisibility(View.INVISIBLE);
                    //update the text in the target view to reflect the data being dropped
                    dropTarget.setText(dropTarget.getText().toString() + dropped.getText().toString());
                    //make it bold to highlight the fact that an item has been dropped
                    dropTarget.setTypeface(Typeface.DEFAULT_BOLD);
                    //if an item has already been dropped here, there will be a tag
                    Object tag = dropTarget.getTag();
                    //if there is already an item here, set it back visible in its original place
                    if(tag!=null)
                    {
                        //the tag is the view id already dropped here
                        int existingID = (Integer)tag;
                        //set the original view visible again
                        container.findViewById(existingID).setVisibility(View.VISIBLE);
                    }
                    //set the tag in the target view being dropped on - to the ID of the view being dropped
                    dropTarget.setTag(dropped.getId());
                    //remove setOnDragListener by setting OnDragListener to null, so that no further drag & dropping on this TextView can be done
                    dropTarget.setOnDragListener(null);
                }
                else
                    //displays message if first character of dropTarget is not equal to first character of dropped

                break;
            case DragEvent.ACTION_DRAG_ENDED:
                //no action necessary
                break;
            default:
                break;
        }
        return true;
    }
}

