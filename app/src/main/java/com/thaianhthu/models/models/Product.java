package com.thaianhthu.models.models;

public class Product {
    private int product_id;
    private String product_code;
    private String product_name;
    private double unit_price;
    private String image_link;

    public Product(int product_id, String product_code, String product_name, double unit_price, String image_link) {
        this.product_id = product_id;
        this.product_code = product_code;
        this.product_name = product_name;
        this.unit_price = unit_price;
        this.image_link = image_link;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }


}