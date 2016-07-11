package com.example.acer.englishlearner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GrammarCausativeFormActivity2 extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    TextView text1,text2,text3,text4;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_causativeform_second);
        button1 = (ImageButton)findViewById(R.id.imgbtn);
        button2 = (ImageButton)findViewById(R.id.imgbtn_second);
        button3 = (ImageButton)findViewById(R.id.imgbtn_third);
        button4 = (ImageButton)findViewById(R.id.imgbtn_fourth);
        btn = (Button)findViewById(R.id.btn1_next);

        text1 = (TextView)findViewById(R.id.choice_1);
        text2 = (TextView)findViewById(R.id.choice_2);
        text3 = (TextView)findViewById(R.id.choice_3);
        text4 = (TextView)findViewById(R.id.choice_4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("I had my car washed.");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText("We had the documents typed.");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text3.setText("She had the fridge repaired");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text4.setText("They had their grass cut");
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GrammarCausativeFormActivity2.this, GrammarCausativeFormActivity3.class);
                startActivity(intent);
            }
        });
    }
}
