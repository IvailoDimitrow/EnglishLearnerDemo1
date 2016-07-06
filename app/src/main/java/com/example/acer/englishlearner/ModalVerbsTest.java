package com.example.acer.englishlearner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class ModalVerbsTest extends AppCompatActivity {
    RadioButton btn;
    int score;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modal_verbs_test);
        btn = (RadioButton)findViewById(R.id.radio_answear1_verbs1);
        text = (TextView)findViewById(R.id.score_modalverbs);
        score = 0;
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_answear1_verbs1:
                if (checked) {
                   score++;
                    text.setText(score);
                    break;
                }
            case R.id.radio_answear2_verbs1:
                if (checked) {

                    break;

                }
            case R.id.radio_answear1_verbs2:
                if (checked) {
                    score++;
                    text.setText(score);
                    break;
                }
            case R.id.radio_answear2_verbs2:
                if (checked) {

                    break;

                }
            case R.id.radio_answear1_verbs3:
                if (checked) {

                    break;
                }
            case R.id.radio_answear2_verbs3:
                if (checked) {
                    score++;
                    text.setText(score);
                    break;

                }
            case R.id.radio_answear1_verbs4:
                if (checked) {

                    break;
                }
            case R.id.radio_answear2_verbs4:
                if (checked) {
                    score++;
                    text.setText(score);
                    break;

                }
            case R.id.radio_answear1_verbs5:
                if (checked) {
                    score++;
                    text.setText(score);
                    break;
                }
            case R.id.radio_answear2_verbs5:
                if (checked) {

                    break;

                }
        }
    }
}
