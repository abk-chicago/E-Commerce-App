package com.els.yourwaycafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        YWCSQLiteOpenHelper db = new YWCSQLiteOpenHelper(this);
        db.getReadableDatabase();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton mStart = (ImageButton)findViewById(R.id.btn_start);



        assert mStart != null;

        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntentMenu = new Intent(MainActivity.this,FoodMenuActivity.class);
                startActivity(mIntentMenu);
            }
        });






    }


}
















    

