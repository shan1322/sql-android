package com.example.shantanu.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Shantanu on 10/28/2017.
 */

public class dboperations extends SQLiteOpenHelper{
    public static final String DATABSE_NAME="VIT.db";
    public static final String create_query="create table "+Productcont.productentry.TABLE_NAME+"("+Productcont.productentry.REGNO + " text,"
        +Productcont.productentry.ROOMNO+" text,"
        +Productcont.productentry.BLOCKNO+" text,"
        +Productcont.productentry.MOBILE+" text,"
        +Productcont.productentry.COST +" text,"
        +Productcont.productentry.TITLE+" text);";


    public dboperations(Context context) {
        super(context, DATABSE_NAME, null,1);
        Log.d("database created","irritating hai");
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(create_query);
        Log.d("Datbase","Created");
    }
    public void insertData(SQLiteDatabase db, String regno, String roomno, String blockno, String mobileno, String title, String cost)
    {
        ContentValues contentValues=new ContentValues();
        contentValues.put(Productcont.productentry.REGNO,regno);
        contentValues.put(Productcont.productentry.ROOMNO,roomno);
        contentValues.put(Productcont.productentry.BLOCKNO,blockno);
        contentValues.put(Productcont.productentry.MOBILE,mobileno);
        contentValues.put(Productcont.productentry.TITLE,title);
        contentValues.put(Productcont.productentry.COST,cost);
        db.insert(Productcont.productentry.TABLE_NAME,null,contentValues);
        Log.d("one set","inserted");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void show(SQLiteDatabase db)
    {
        db.execSQL("select*from"+Productcont.productentry.TABLE_NAME);
    }



}
