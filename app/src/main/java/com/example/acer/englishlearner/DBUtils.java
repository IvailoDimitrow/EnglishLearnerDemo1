package com.example.acer.englishlearner;

import android.content.Context;
import android.database.Cursor;

/**
 * Created by VS-PC on 7/5/2016.
 */
public class DBUtils {
    private static DBUtils instance;
    private DBHelper db;

    private DBUtils(Context context){
        initDB(context);
    }
    public static DBUtils getInstance(Context context){
        if(instance == null){
            instance = new DBUtils(context);
        }
        return instance;
    }
    private DBHelper initDB(Context context){
        if(db == null){
            db = new DBHelper(context);
        }
        return db;
    }
    public void writeNodeRecord(Node node){
        db.insertNode(node);
    }
    public Cursor readNodeRecord(){
        return db.getNodeValues();
    }
}
