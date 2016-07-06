package com.example.acer.englishlearner;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SingInActivity extends AppCompatActivity {
    private DBUtils dbUtils;
    private List<Node> nodes;
    EditText username;
    EditText password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        nodes = new ArrayList<Node>();
        dbUtils = DBUtils.getInstance(this);
        username = (EditText)findViewById(R.id.editTextUserNameToLogin);
        password = (EditText)findViewById(R.id.editTextPasswordToLogin);
        btn = (Button)findViewById(R.id.buttonSignIn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                readDB();
            }
        });



    }

    public void readDB() {
        Cursor cursor = dbUtils.readNodeRecord();
        if (cursor.moveToFirst()) {
            do {
                String nodeName = cursor.getString(cursor.getColumnIndex(DBHelper.KEY_NAME));
                String nodePassword = cursor.getString(cursor.getColumnIndex(DBHelper.KEY_PASSWORDS));
                Log.d("Name", nodeName);
                Log.d("Password", nodePassword);
                if(username.getText().toString().equals(nodeName)
                        && password.getText().toString().equals(nodePassword)){
                    Toast.makeText(this, "You are logged",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(SingInActivity.this, MainActivity.class);
                    startActivity(intent);
                    break;
                } else {
                    Toast.makeText(this, "You are not logged",Toast.LENGTH_LONG).show();
                }
            } while (cursor.moveToNext());
        }
    }
}
