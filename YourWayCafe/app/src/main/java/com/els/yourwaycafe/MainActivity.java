package com.els.yourwaycafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mStart;
//    Button mPrev;
//    Button mFav;
    Intent mIntent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStart = (Button) findViewById(R.id.btn_start);
//        mFav = (Button) findViewById(R.id.btn_fav);
//        mPrev = (Button) findViewById(R.id.btn_prev);


        mIntent = new Intent(MainActivity.this, FoodMenuActivity.class);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mIntent);


            }
        };
        mStart.setOnClickListener(listener);

    }
}
















    

