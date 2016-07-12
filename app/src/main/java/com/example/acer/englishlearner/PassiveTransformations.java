package com.example.acer.englishlearner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PassiveTransformations extends AppCompatActivity {
    EditText text,text2,text3,text4;
    String sentence,sentence2,sentence3,sentence4;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passive_grammar_transformations);

        text = (EditText)findViewById(R.id.edt1);
        text2 = (EditText)findViewById(R.id.edt2);
        text3 = (EditText)findViewById(R.id.edt3);
        text4 = (EditText)findViewById(R.id.edt4);
        btn = (Button)findViewById(R.id.btn_check);

        sentence = "The work has been being done by John.";
        sentence2 = "The work will be finished by 5:00 PM.";
        sentence3 = "The pies would always be made by my mother.";
        sentence4 = "The bills used to be paid by Jerry.";

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals(sentence)){
                    text.setTextColor(Color.GREEN);
                }else {
                 text.setTextColor(Color.RED);
                }
                if(text2.equals(sentence2)){
                    text2.setTextColor(Color.GREEN);
                }else {
                    text2.setTextColor(Color.GREEN);
                }
                if(text3.equals(sentence3)){
                    text3.setTextColor(Color.GREEN);
                }else {
                    text3.setTextColor(Color.GREEN);
                }
                if(text4.equals(sentence4)){
                    text4.setTextColor(Color.GREEN);
                }else {
                    text4.setTextColor(Color.GREEN);
                }
            }
        });



    }
}
