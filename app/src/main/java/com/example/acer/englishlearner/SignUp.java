package com.example.acer.englishlearner;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {
    EditText username;
    EditText password;
    Button btnCreateAcc;
    Node node;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singup);
        username = (EditText)findViewById(R.id.editTextUserName);
        password = (EditText)findViewById(R.id.editTextPassword);
         node = new Node(username.getText().toString(),password.getText().toString());
        btnCreateAcc = (Button) findViewById(R.id.buttonCreateAccount);
        btnCreateAcc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                DBUtils.getInstance(SignUp.this).writeNodeRecord(node);
                Intent intent = new Intent(SignUp.this, SingInActivity.class);
                startActivity(intent);
            }
        });

    }

}
