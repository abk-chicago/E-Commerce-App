package com.els.yourwaycafe;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CursorAdapter;
import android.widget.ImageButton;
import android.widget.ListView;


public class FoodMenuActivity extends AppCompatActivity {



    private YWCSQLiteOpenHelper db;
    private ListView mMenuListView;
    private CursorAdapter mCursorAdapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

        YWCSQLiteOpenHelper db = new YWCSQLiteOpenHelper(this);

        Cursor list = db.getProteinsList();
        list.moveToFirst();


//        handleIntent(getIntent());


        ImageButton mAdd = (ImageButton) findViewById(R.id.add_btn);
        assert mAdd != null;
        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntentCart = new Intent(FoodMenuActivity.this, ShoppingCartActivity.class);
                startActivity(mIntentCart);
            }
        });




    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu, menu);
//
//        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
//        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
//        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
//        searchView.setQueryHint("Look for your favorites here");
//
//        return true;
//    }
//
//    @Override
//    protected void onNewIntent(Intent intent) {
//        handleIntent(intent);
//    }
//
//    private void handleIntent(Intent intent) {
//
//
//
//        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
//            String query = intent.getStringExtra(SearchManager.QUERY);
//            Cursor c = db.searchMenuList(query);
//            mCursorAdapter.changeCursor(c);
//            mCursorAdapter.notifyDataSetChanged();
//
//
//        }
//
//
//    }
}




