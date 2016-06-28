package com.els.yourwaycafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mStart;
    Button mPrev;
    Button mFav;
    View.OnClickListener mOnClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStart = (Button) findViewById(R.id.btn_start);
        mFav = (Button) findViewById(R.id.btn_fav);
        mPrev = (Button) findViewById(R.id.btn_prev);

        /*mOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            */
    }
        }

    

