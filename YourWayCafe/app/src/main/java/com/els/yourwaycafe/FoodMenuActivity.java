package com.els.yourwaycafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class FoodMenuActivity extends AppCompatActivity {
    private Intent Drinks;
    private Intent Proteins;
    private Intent Sides;
    private Button mcart;
    private Spinner mSpinner;
    private SpinnerAdapter mSpinnerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
    }
}
