package com.example.acer.englishlearner;
import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentTwo extends Fragment {

    TextView option1, option2, option3, option4, option5, choice1, choice2, choice3, choice4, choice5;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        option1 = (TextView) container.findViewById(R.id.had_my_car_washed);
        option2 = (TextView) container.findViewById(R.id.had_my_grass_cut);
        option3 = (TextView) container.findViewById(R.id.had_the_fridge_repaired);
        option4 = (TextView) container.findViewById(R.id.documents_typed);
        option5 = (TextView) container.findViewById(R.id.windows_cleaned);

        choice1 = (TextView) container.findViewById(R.id.choice_1);
        choice2 = (TextView) container.findViewById(R.id.choice_2);
        choice3 = (TextView) container.findViewById(R.id.choice_3);
        choice4 = (TextView) container.findViewById(R.id.choice_4);
        choice5 = (TextView) container.findViewById(R.id.choice_5);





        return inflater.inflate(R.layout.frame_causativeform_second, container, false);
    }
}


