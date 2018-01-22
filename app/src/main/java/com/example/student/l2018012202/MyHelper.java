package com.example.student.l2018012202;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Student on 2018/1/22.
 */

public class MyHelper extends SQLiteOpenHelper {
    final static  String DB_Name = "student.sqlite";  //創一個檔案名稱
    final  static  int VERSION = 1;
    public MyHelper(Context context) {
        super(context, DB_Name, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE `students` ( `_id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT, `score` INTEGER )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
