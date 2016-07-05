package com.els.yourwaycafe;

/**
 * Created by ericaschulz on 6/27/16.
 */
public class Sides {
    private int id;
    private String sideDish;
    private int sideDishPrice;

    public static final Sides[] sides = {
            new Sides(1,"Mashed potatoes",3),
            new Sides(2,"Coleslaw",2),
            new Sides(3,"Sauteed spinach",3),
            new Sides(4,"Baked potato", 2),
            new Sides(5,"Baby corn",2)
    };

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
