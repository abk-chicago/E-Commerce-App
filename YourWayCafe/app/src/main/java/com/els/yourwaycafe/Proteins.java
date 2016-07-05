package com.els.yourwaycafe;

/**
 * Created by ericaschulz on 6/27/16.
 */
public class Proteins {
    private int id;
    private String name;
    private int price;


    public static final Proteins[] proteins = {
            new Proteins(1,"Steak",8),
            new Proteins(2,"Chicken",6),
            new Proteins(3,"Pork",6),
            new Proteins(4,"Tilapia",4),
            new Proteins(5,"Beans",2)

    };

    public Proteins(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
