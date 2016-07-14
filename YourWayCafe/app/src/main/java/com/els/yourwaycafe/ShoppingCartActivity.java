package com.els.yourwaycafe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShoppingCartActivity extends AppCompatActivity {


    ListView mCartListView;
    ArrayAdapter mCartAdapter;
    AdapterView.OnItemLongClickListener mLongClickListener;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        mCartListView = (ListView)findViewById(R.id.cart_list_view);
        assert mCartListView != null;
        mCartListView.setAdapter(mCartAdapter);

        CartSingleton cart = CartSingleton.getInstance();
        cart.add("test");

//        mLongClickListener = new AdapterView.OnItemLongClickListener(){
//            @Override
//            public onItemLongClick(AdapterView<?> parent,View view, int position, long id) {
//                Toast.makeText(ShoppingCartActivity.this,"Removed from your cart",Toast.LENGTH_SHORT).show();
//            }
//        };
//        mCartListView.setOnItemLongClickListener(mLongClickListener);





    }
}
