package com.example.tutorial4.Database;

import android.database.sqlite.SQLiteDatabase;

public class DBHelper  extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "UserInfo.db";




    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_ENTRIES = "CREATE TABLE " + User.Users.TABLE_NAME + " (" +
                User.class._ID + " INTEGER PRIMARY KEY," +
                User.class.COLUMN_NAME_USERNAME + " TEXT," +
                User.class.COLUMN_NAME_PASSWORD + " Text)";

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
