package com.els.yourwaycafe;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class DrinksActivity extends ListActivity {

    private ListView mListviewDrinks;
    private AdapterView.OnItemClickListener mItemClickListenerDrinks;
    private Button mButtonDrinksAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
    }
}
