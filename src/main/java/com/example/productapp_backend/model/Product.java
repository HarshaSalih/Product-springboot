package com.example.productapp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="product")

public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private int productCode;
    private String productName;
    private String man_date;
    private String exp_date;
    private String brand;
    private int price;
    private String sellerName;
    private String distributorName;

    public Product() {
    }

    public Product(int id, int productCode, String productName, String man_date, String exp_date, String brand, int price, String sellerName, String distributorName) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.man_date = man_date;
        this.exp_date = exp_date;
        this.brand = brand;
        this.price = price;
        this.sellerName = sellerName;
        this.distributorName = distributorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMan_date() {
        return man_date;
    }

    public void setMan_date(String man_date) {
        this.man_date = man_date;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }
}
