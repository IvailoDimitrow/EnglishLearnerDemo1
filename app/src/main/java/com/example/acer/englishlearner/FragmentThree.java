package com.example.acer.englishlearner;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.acer.englishlearner.R;

/**
 * Created by VS-PC on 7/5/2016.
 */
public class FragmentThree extends Fragment {
   TextView txt;
    int score;
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        txt = (TextView) container.findViewById(R.id.score);
        return inflater.inflate(R.layout.frame_causativeform_three, container, false);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio_pirates1:
                if (checked)
                    score++;
                   txt.setText(score);
                    break;
            case R.id.radio_ninjas1:
                if (checked)

                    break;
        }
    }
}
