package com.example.acer.englishlearner;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GrammarPassive extends AppCompatActivity{
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passive_grammar);
        btnNext = (Button)findViewById(R.id.next_passive);
        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent = new Intent(GrammarPassive.this, PassiveTransformations.class);
                startActivity(intent);
            }
        });

    }
}
