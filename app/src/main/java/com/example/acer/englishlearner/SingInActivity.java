package com.example.acer.englishlearner;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class SingInActivity extends AppCompatActivity {
    private DBUtils dbUtils;
    private List<Node> nodes;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        nodes = new ArrayList<Node>();
        dbUtils = DBUtils.getInstance(this);
        readDB();


    }

    public void readDB() {
        Cursor cursor = dbUtils.readNodeRecord();
        if (cursor.moveToFirst()) {
            do {
                String nodeName = cursor.getString(cursor.getColumnIndex(DBHelper.KEY_NAME));
                String nodePassword = cursor.getString(cursor.getColumnIndex(DBHelper.KEY_PASSWORDS));
                Log.d("Name", nodeName);
                Log.d("Password", nodePassword);
                if(nodeName.equals(username.getText().toString()) && nodePassword.equals(password.getText().toString())){

                }
            } while (cursor.moveToNext());
        }
    }
}
