package com.els.yourwaycafe;

/**
 * Created by ericaschulz on 6/27/16.
 */
public class Sides {
    private int id;
    private String sideDish;
    private int sideDishPrice;
    private String type;

    public static final Sides[] sides = {
            new Sides(1,"Mashed potatoes",3,"sides"),
            new Sides(2,"Coleslaw",2,"sides"),
            new Sides(3,"Sauteed spinach",3, "sides"),
            new Sides(4,"Baked potato", 2, "sides"),
            new Sides(5,"Baby corn",2, "sides")
    };

    public Sides(int id, String sideDish, int sideDishPrice, String type) {
        this.id = id;
        this.sideDish = sideDish;
        this.sideDishPrice = sideDishPrice;
        this.type= type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //used by ArrayAdapter
    @Override
    public String toString(){
        return sideDish;
    }
}
