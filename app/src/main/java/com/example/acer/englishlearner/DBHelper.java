package com.example.acer.englishlearner;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by VS-PC on 7/5/2016.
 */
public class DBHelper extends SQLiteOpenHelper {
    protected SQLiteDatabase database;
    public static final String DB_TABLE_NODES = "DB_TABLE_NODES";
    public static final String KEY_NAME = "KEY_NAME";
    public static final String KEY_PASSWORDS = "Passwords";
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "Database Name";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        open();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createMuseumTable());
    }
    public void close(){
        database.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + DB_TABLE_NODES);
        onCreate(db);
    }

    private  String createMuseumTable(){
        return "CREATE TABLE IF NOT EXISTS " + DB_TABLE_NODES + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KEY_NAME + " TEXT, "
                + KEY_PASSWORDS + " TEXT);";
    }
    public void open(){
        database = this.getWritableDatabase();
    }
    public void insertNode(Node node){
        open();
        ContentValues cv = new ContentValues();
        cv.put(KEY_NAME, node.getPassword());
        cv.put(KEY_PASSWORDS, node.getName());
        database.insert(DB_TABLE_NODES,null,cv);

    }
    public Cursor getNodeValues(){
        return this.database.query(DB_TABLE_NODES, new String[]{KEY_NAME, KEY_PASSWORDS},
                null, null, null, null, null);
    }
}
