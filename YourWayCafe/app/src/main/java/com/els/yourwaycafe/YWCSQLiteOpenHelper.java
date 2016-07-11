package com.els.yourwaycafe;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ericaschulz on 7/10/16.
 */
public class YWCSQLiteOpenHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "YWC_DB";
    public static final String MENU_LIST_TABLE_NAME = "MENU_LIST";
    public static final String SHOPPING_CART_TABLE_NAME= "SHOPPING_CART";
    //public static final String FAV_TABLE_NAME = "SAVED_FAVORITES";
    //public static final String PREV_TABLE_NAME = "PREVIOUS ORDERS";


    public static final String COL_ID = "_id";
    public static final String COL_ITEM_NAME = "ITEM_NAME";
    public static final String COL_ITEM_PRICE = "PRICE";
    public static final String COL_ITEM_TYPE = "TYPE";


    public static final String[] MENU_COLUMNS = {COL_ID,COL_ITEM_NAME,COL_ITEM_PRICE,COL_ITEM_TYPE};

    private static final String CREATE_MENU_LIST_TABLE =
            "CREATE TABLE " + MENU_LIST_TABLE_NAME +
                    "(" +
                    COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COL_ITEM_NAME + " TEXT, " +
                    COL_ITEM_PRICE + " TEXT, " +
                    COL_ITEM_TYPE + " TEXT )";


    public static final String[] SHOPPING_CART_COLUMNS = {COL_ID,COL_ITEM_NAME,COL_ITEM_PRICE,COL_ITEM_TYPE};

    private static final String CREATE_SHOPPING_CART_TABLE =
            "CREATE TABLE " + SHOPPING_CART_TABLE_NAME +
                    "(" +
                    COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COL_ITEM_NAME + " TEXT, " +
                    COL_ITEM_PRICE + " TEXT, " +
                    COL_ITEM_TYPE + " TEXT )";

    private static YWCSQLiteOpenHelper instance;
    public static YWCSQLiteOpenHelper getInstance(Context context) {
        if(instance == null){
            instance = new YWCSQLiteOpenHelper(context);
        }
        return instance;
    }


    public YWCSQLiteOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_MENU_LIST_TABLE);
        db.execSQL(CREATE_SHOPPING_CART_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + SHOPPING_CART_TABLE_NAME);
        this.onCreate(db);
    }


    public long addItem(String name, String description, String price, String type){
        ContentValues values = new ContentValues();
        values.put(COL_ITEM_NAME, name);
        values.put(COL_ITEM_PRICE, price);
        values.put(COL_ITEM_TYPE, type);

        SQLiteDatabase db = this.getWritableDatabase();
        long returnId = db.insert(MENU_LIST_TABLE_NAME, null, values);
        db.close();
        return returnId;
    }

    public Cursor getMenuList(){

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(MENU_LIST_TABLE_NAME, // a. table
                MENU_COLUMNS, // b. column names
                null, // c. selections
                null, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit

        return cursor;
    }
    public Cursor searchMenuList(String query){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(MENU_LIST_TABLE_NAME, // a. table
                MENU_COLUMNS, // b. column names
                COL_ITEM_NAME + " LIKE ?", // c. selections
                new String[]{"%"+query+"%"}, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit

        return cursor;
    }

    public int deleteItem(int id){
        SQLiteDatabase db = getWritableDatabase();
        int deleteNum = db.delete(SHOPPING_CART_TABLE_NAME,
                COL_ID + " = ?",
                new String[]{String.valueOf(id)});
        db.close();
        return deleteNum;
    }
}



