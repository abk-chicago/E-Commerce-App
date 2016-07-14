package com.els.yourwaycafe;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class DrinksActivity extends ListActivity {

    private TextView mDrinksTextView;
    private AdapterView.OnItemClickListener mItemClickListenerDrinks;
    private Button mButtonDrinksAdd;
    private ArrayAdapter<String>mArrayAdapterDrinks;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);


    }
}
