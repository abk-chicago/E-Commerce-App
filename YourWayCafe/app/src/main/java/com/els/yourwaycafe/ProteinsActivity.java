package com.els.yourwaycafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class ProteinsActivity extends AppCompatActivity {

    private ListView mListViewProteins;
    private AdapterView.OnItemClickListener mOnItemClickListenerProteins;
    private Button mButtonProteinsAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proteins);
    }
}
