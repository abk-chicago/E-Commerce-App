package com.els.yourwaycafe;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodMenuActivity extends ListActivity {

    private ListView mListViewMenu;
    private ArrayAdapter mArrayAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);


        mListViewMenu = (ListView)findViewById(R.id.list);












}}
