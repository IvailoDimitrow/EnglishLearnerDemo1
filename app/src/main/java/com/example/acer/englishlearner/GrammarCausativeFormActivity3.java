package com.example.acer.englishlearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class GrammarCausativeFormActivity3 extends AppCompatActivity {
    int score;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_causativeform_three);
        score = 0;
        text = (TextView)findViewById(R.id.score_causativeform);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_pirates1:
                if (checked) {
                    score++;
                    text.setText(score);
                    break;
                }
            case R.id.radio_ninjas1:
                if (checked) {

                    break;

                }
            case R.id.radio_pirates2:
                if (checked) {
                    score++;
                    text.setText(score);
                    break;
                }
            case R.id.radio_ninjas2:
                if (checked) {

                    break;

                }
            case R.id.radio_pirates3:
                if (checked) {

                    break;
                }
            case R.id.radio_ninjas3:
                if (checked) {
                    score++;
                    text.setText(score);
                    break;

                }
            case R.id.radio_pirates4:
                if (checked) {

                    break;
                }
            case R.id.radio_ninjas4:
                if (checked) {
                    score++;
                    text.setText(score);
                    break;

                }
            case R.id.radio_pirates5:
                if (checked) {
                    score++;
                    text.setText(score);
                    break;
                }
            case R.id.radio_ninjas5:
                if (checked) {

                    break;

                }
        }
    }
}
