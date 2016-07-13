package com.els.yourwaycafe;

import java.util.ArrayList;

/**
 * Created by ericaschulz on 7/11/16.
 */
public class CartSingleton extends ArrayList<String> {

    private static CartSingleton ourInstance = new CartSingleton();

    public static CartSingleton getInstance() {

        if(ourInstance==null)
            ourInstance=new CartSingleton();
        return ourInstance;
    }

    CartSingleton() {

    }


}


