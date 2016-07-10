package com.example.acer.englishlearner;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class
StartingActivity extends AppCompatActivity  {
    Button signIn;
    Button signUp;
    EditText username;
    EditText password;
    Node node;
    DBHelper helper;
    String getName,getPassword;
    Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_main);
        ok = (Button) findViewById(R.id.button3);
        signIn = (Button) findViewById(R.id.button);
        signUp = (Button) findViewById(R.id.button2);
        username = (EditText) findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        signIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                node = new Node(username.getText().toString(), password.getText().toString());
                helper = new DBHelper(getBaseContext());
                helper.open();
                helper.insertNode(node);
                helper.close();
//                        Intent intent = new Intent(StartingActivity.this, MainActivity.class);
//                        startActivity(intent);
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getName = "";
                getPassword = "";
                helper = new DBHelper(getBaseContext());
                helper.open();
                Cursor C = helper.getNodeValues();
                if(C.moveToFirst()){
                    do{
                        getName = C.getString(0);
                        getPassword = C.getString(1);
                    }while(C.moveToNext());
                }
                Toast.makeText(getBaseContext(), "Signed up", Toast.LENGTH_SHORT).show();
            }
        });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getName.equals(null) && getPassword.equals(null)) {
                    Toast.makeText(StartingActivity.this, "Please create account", Toast.LENGTH_SHORT).show();
                }
                if (getName.equals(username.getText().toString()) && getPassword.equals(password.getText().toString())) {
                    Intent intent = new Intent(StartingActivity.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getBaseContext(), "Welcome" + "" + getName + "!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(StartingActivity.this, "Your username or password is not correct", Toast.LENGTH_SHORT).show();
                }
            }
        });
}
}
