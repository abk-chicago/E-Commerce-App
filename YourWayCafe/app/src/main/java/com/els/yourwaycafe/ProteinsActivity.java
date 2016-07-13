package com.els.yourwaycafe;

import android.app.ListActivity;
import android.os.Bundle;

public class ProteinsActivity extends ListActivity {

//    private ListView mListViewProteins;
//    private AdapterView.OnItemClickListener mOnItemClickListenerProteins;
//    private Button mButtonProteinsAdd;
//    private YWCSQLiteOpenHelper db;
//    private ArrayAdapter mArrayAdapter;
//    private CursorAdapter mCursorAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proteins);




//        mListViewProteins = (ListView)findViewById(R.id.list_view_proteins);
//
//        db = new YWCSQLiteOpenHelper(ProteinsActivity.this);
//        Cursor cursor = db.getProteinsList();
//
//        mCursorAdapter = new SimpleCursorAdapter(this,android.R.layout.simple_list_item_1,cursor,new String[]{YWCSQLiteOpenHelper.COL_ITEM_NAME},new int[]{android.R.id.text1},0);
//        mListViewProteins.setAdapter(mCursorAdapter);
//


    }

}
