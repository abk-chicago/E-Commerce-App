package com.els.yourwaycafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mStart = (Button)findViewById(R.id.btn_start);
        Button mPrev = (Button) findViewById(R.id.btn_prev);
        Button mFav = (Button)findViewById(R.id.btn_fav);
        View.OnClickListener listener;

        assert mStart != null;

        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntentMenu = new Intent(MainActivity.this,FoodMenuActivity.class);
                startActivity(mIntentMenu);
            }
        });






    }

//    public static void startClick(View v) {
//        @Override
//
//
//
//
//
//    }
//
//    public static void showFav(View v){
//
//    }
//
//    public static void showPrev(View v) {
//
//    }
}
















    

