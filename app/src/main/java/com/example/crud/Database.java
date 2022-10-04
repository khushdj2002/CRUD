package com.example.crud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.crud.MainActivity;

class Database extends SQLiteOpenHelper {

    final static String databasename="Student";
    final static String tablename = "student";
    final static String col1 = "id";
    final static String col2 = "name";
    final static String col3="university";

    public Database(@Nullable Context context) {
        super(context, databasename, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
