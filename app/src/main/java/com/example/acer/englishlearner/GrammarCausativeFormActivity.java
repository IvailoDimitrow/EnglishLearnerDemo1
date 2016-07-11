package com.example.acer.englishlearner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GrammarCausativeFormActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_causativeform_one_grammar);
        btn = (Button)findViewById(R.id.button_next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GrammarCausativeFormActivity.this, GrammarCausativeFormActivity2.class);
                startActivity(intent);
            }
        });
    }
}
