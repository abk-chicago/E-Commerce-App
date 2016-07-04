package com.els.yourwaycafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class SidesActivity extends AppCompatActivity {

    private ListView mListViewSides;
    private AdapterView.OnItemClickListener mOnItemClickListenerSides;
    private Button mButtonSidesAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sides);


    }
}
