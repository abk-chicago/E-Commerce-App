package com.els.yourwaycafe;

/**
 * Created by ericaschulz on 6/27/16.
 */
public class Drinks {
    private int id;
    private String brand;
    private int brandPrice;
    private String type;


    public static final Drinks[] drinks = {
            new Drinks(1,"Coke",1,"drinks"),
            new Drinks(2,"Diet Coke",1, "drinks"),
            new Drinks(3,"Iced Tea",2, "drinks"),
            new Drinks(4,"Lemonade",2, "drinks"),
            new Drinks(5,"Coffee",2, "drinks")

    };

    public Drinks(int id, String brand, int brandPrice, String type) {
        this.id = id;
        this.brand = brand;
        this.brandPrice = brandPrice;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBrandPrice() {
        return brandPrice;
    }

    public void setBrandPrice(int brandPrice) {
        this.brandPrice = brandPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
