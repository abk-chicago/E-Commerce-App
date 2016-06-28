package com.els.yourwaycafe;

/**
 * Created by ericaschulz on 6/27/16.
 */
public class Sides {
    private int id;
    private String sideDish;
    private int sideDishPrice;

    public Sides(int id, String sideDish, int sideDishPrice) {
        this.id = id;
        this.sideDish = sideDish;
        this.sideDishPrice = sideDishPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public int getSideDishPrice() {
        return sideDishPrice;
    }

    public void setSideDishPrice(int sideDishPrice) {
        this.sideDishPrice = sideDishPrice;
    }
}
