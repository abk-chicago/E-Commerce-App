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
    public static final String DATABASE_NAME = "YWC.db";
    public static final String PROTEINS_LIST_TABLE_NAME ="proteins_list";
    public static final String SIDES_LIST_TABLE_NAME = "sides_list";
    public static final String DRINKS_LIST_TABLE_NAME = "drinks_list";


    public static final String COL_ID = "_id";
    public static final String COL_ITEM_NAME = "ITEM_NAME";
    public static final String COL_ITEM_PRICE = "PRICE";


    public static final String[] PROTEINS_COLUMNS = {COL_ID,COL_ITEM_NAME,COL_ITEM_PRICE};
    private static final String CREATE_PROTEINS_LIST_TABLE =
            "CREATE TABLE " + PROTEINS_LIST_TABLE_NAME +
                    "(" +
                    COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COL_ITEM_NAME + " TEXT, " +
                    COL_ITEM_PRICE + " TEXT) ";


    public static final String[] SIDES_COLUMNS = {COL_ID,COL_ITEM_NAME,COL_ITEM_PRICE};
    private static final String CREATE_SIDES_LIST_TABLE =
            "CREATE TABLE " + SIDES_LIST_TABLE_NAME +
                    "(" +
                    COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COL_ITEM_NAME + " TEXT, " +
                    COL_ITEM_PRICE + " TEXT) ";


    public static final String[] DRINKS_COLUMNS = {COL_ID,COL_ITEM_NAME,COL_ITEM_PRICE};
    private static final String CREATE_DRINKS_LIST_TABLE =
            "CREATE TABLE " + DRINKS_LIST_TABLE_NAME +
                    "(" +
                    COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COL_ITEM_NAME + " TEXT, " +
                    COL_ITEM_PRICE + " TEXT) ";




    private static YWCSQLiteOpenHelper instance;
    synchronized public static YWCSQLiteOpenHelper getInstance(Context context) {
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

        db.execSQL(CREATE_PROTEINS_LIST_TABLE);
        seedDataProteins(db);

        db.execSQL(CREATE_SIDES_LIST_TABLE);
        seedDataSides(db);

        db.execSQL(CREATE_DRINKS_LIST_TABLE);
        seedDataDrinks(db);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS" + PROTEINS_LIST_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS" + DRINKS_LIST_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS" + SIDES_LIST_TABLE_NAME);
        this.onCreate(db);

    }



    public void insertPdata(SQLiteDatabase db, int id, String name, String price) {
        //insert into table_name values (1,etc,etc)

        ContentValues values = new ContentValues();
        values.put("id", id);
        values.put("name", name);
        values.put("price", price);

        db.insert(PROTEINS_LIST_TABLE_NAME, null, values);
    }
    public void insertSdata(SQLiteDatabase db, int id, String name, String price) {

        ContentValues values = new ContentValues();
        values.put("id", id);
        values.put("name", name);
        values.put("price", price);

        db.insert(SIDES_LIST_TABLE_NAME, null, values);
    }
    public void insertDdata(SQLiteDatabase db, int id, String name, String price) {

        ContentValues values = new ContentValues();
        values.put("id", id);
        values.put("name", name);
        values.put("price", price);

        db.insert(DRINKS_LIST_TABLE_NAME, null, values);
    }


    public void seedDataProteins(SQLiteDatabase db) {
        insertPdata(db, 1, "Rib Eye Steak", "$10");
        insertPdata(db, 2, "Roast Chicken", "$8");
        insertPdata(db, 3, "Smothered Pork Chops", "$8");
        insertPdata(db, 4, "Baked Tilapia", "$7");
        insertPdata(db, 5, "Slow-cooked Black Beans", "$4");
    }

    public void seedDataSides(SQLiteDatabase db) {
        insertSdata(db, 1, "Coleslaw", "$2");
        insertSdata(db, 2, "Mashed potatoes", "$3");
        insertSdata(db, 3, "Macaroni and cheese", "$3");
        insertSdata(db, 4, "French Fries", "$2");
        insertSdata(db, 5, "Hummus", "$4");
    }
    public void seedDataDrinks(SQLiteDatabase db) {
        insertDdata(db, 1, "Coke", "$1");
        insertDdata(db, 2, "Diet Coke", "$1");
        insertDdata(db, 3, "Iced Tea", "$2");
        insertDdata(db, 4, "Coffee", "$1");
        insertDdata(db, 5, "Lemonade", "$2");

    }

    public Cursor getProteinsList(){

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + PROTEINS_LIST_TABLE_NAME, null);

        return cursor;
    }
    public Cursor getSidesList(){

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + SIDES_LIST_TABLE_NAME, null);

        return cursor;
    }
    public Cursor getDrinksList(){

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + DRINKS_LIST_TABLE_NAME, null);

        return cursor;
    }


    public Cursor searchProteinList(String query){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(PROTEINS_LIST_TABLE_NAME, // a. table
                PROTEINS_COLUMNS, // b. column names
                COL_ITEM_NAME + " LIKE ?", // c. selections
                new String[]{"%"+query+"%"}, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit

        return cursor;
    }
    public Cursor searchDrinkList(String query){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(DRINKS_LIST_TABLE_NAME, // a. table
                DRINKS_COLUMNS, // b. column names
                COL_ITEM_NAME + " LIKE ?", // c. selections
                new String[]{"%"+query+"%"}, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit

        return cursor;
    }
    public Cursor searchSidesList(String query){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(SIDES_LIST_TABLE_NAME, // a. table
                SIDES_COLUMNS, // b. column names
                COL_ITEM_NAME + " LIKE ?", // c. selections
                new String[]{"%"+query+"%"}, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit

        return cursor;
    }


}



