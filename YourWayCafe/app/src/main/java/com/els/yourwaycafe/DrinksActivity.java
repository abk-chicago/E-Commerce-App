package com.els.yourwaycafe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class DrinksActivity extends AppCompatActivity {

    private ListView mListviewDrinks;
    private AdapterView.OnItemClickListener mItemClickListenerDrinks;
    private Button mButtonDrinksAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
    }
}
