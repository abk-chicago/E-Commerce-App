package com.els.yourwaycafe;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by ericaschulz on 7/10/16.
 */
public class DBAssetHelper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "YWC_DB";
    private static final int DATABASE_VERSION = 1;

    public DBAssetHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

}
