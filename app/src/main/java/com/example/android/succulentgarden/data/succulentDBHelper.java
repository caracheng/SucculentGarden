package com.example.android.succulentgarden.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.succulentgarden.data.succulentContract.succulentEntry;

public class succulentDBHelper extends SQLiteOpenHelper {

    private static final String LOG_TAG = succulentDBHelper.class.getSimpleName();

    private static final String DATABASE_NAME = "succulents.db";

    private static final int DATABASE_VERSION = 1;

    public succulentDBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_SUCCULENT_TABLE =  "CREATE TABLE " + succulentEntry.TABLE_NAME + " ("
                + succulentEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + succulentEntry.COLUMN_COMMON_NAME + " TEXT, "
                + succulentEntry.COLUMN_SCIENTIFIC_NAME + " TEXT NOT NULL, "
                + succulentEntry.COLUMN_GROWTH_TYPE + " INTEGER NOT NULL, "
                + succulentEntry.COLUMN_SUN + " INTEGER NOT NULL,"
                + succulentEntry.COLUMN_ZONE + " TEXT);";

        db.execSQL(SQL_CREATE_SUCCULENT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
