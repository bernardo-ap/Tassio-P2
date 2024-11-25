package com.example.tassio_p2;

public class Product {
    private String name;
    private float price;
    private String description;
    private int imageResId;
    private float rating;

    public Product(String name, float price, String description, int imageResId, float rating) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageResId = imageResId;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public float getPrice() {
        return price;
    }

    public float getRating() {
        return rating;
    }
}