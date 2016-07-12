package com.example.acer.englishlearner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class GrammarCausativeFormActivity3 extends AppCompatActivity {
    int score;
    TextView text;
    Button btn,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_causativeform_three);
        score = 0;
        text = (TextView)findViewById(R.id.score_causativeform);
        btn = (RadioButton) findViewById(R.id.radio_pirates1);
        btn2 = (RadioButton) findViewById(R.id.radio_pirates2);
        btn3 = (RadioButton) findViewById(R.id.radio_ninjas3);
        btn4 = (RadioButton) findViewById(R.id.radio_ninjas4);
        btn5 = (RadioButton) findViewById(R.id.radio_pirates5);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_pirates1:
                if (checked) {
                    btn.setBackgroundColor(Color.GREEN);
                } else {
                    btn.setBackgroundColor(Color.GREEN);
                }
                break;
            case R.id.radio_pirates2:
                if (checked) {
                    btn2.setBackgroundColor(Color.GREEN);
                } else {
                    btn2.setBackgroundColor(Color.GREEN);

                }
                break;
            case R.id.radio_ninjas3:
                if (checked) {
                    btn3.setBackgroundColor(Color.GREEN);
                } else {
                    btn3.setBackgroundColor(Color.GREEN);
                }
                break;
            case R.id.radio_ninjas4:
                if (checked) {
                    btn4.setBackgroundColor(Color.GREEN);
                } else {
                    btn4.setBackgroundColor(Color.GREEN);
                }
                break;
            case R.id.radio_pirates5:
                if (checked) {
                    btn5.setBackgroundColor(Color.GREEN);
                } else {
                    btn5.setBackgroundColor(Color.GREEN);
                }
                break;
        }
    }
}
