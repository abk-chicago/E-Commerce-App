package com.els.yourwaycafe;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CursorAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;


public class FoodMenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

        ListView mMenuListView;
        CursorAdapter mCursorAdapter;
        ImageButton mAdd;


        mMenuListView = (ListView)findViewById(R.id.list_view_proteins);

        YWCSQLiteOpenHelper db = new YWCSQLiteOpenHelper(FoodMenuActivity.this);
        Cursor cursor = db.getProteinsList();
        cursor.moveToFirst();

        mCursorAdapter = new SimpleCursorAdapter(this,R.layout.activity_proteins,cursor,new String[]{YWCSQLiteOpenHelper.COL_ITEM_NAME},new int[]{R.id.proteins_text},0);
        mMenuListView.setAdapter(mCursorAdapter);







//        handleIntent(getIntent());


//        ImageButton mAdd = (ImageButton) findViewById(R.id.add_btn);
//        assert mAdd != null;
//        mAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent mIntentCart = new Intent(FoodMenuActivity.this, ShoppingCartActivity.class);
//                startActivity(mIntentCart);
//            }
//        });




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




