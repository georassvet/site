package ru.fishbalka.sport.models;

import ru.fishbalka.sport.forms.ProductForm;

public class Product {
    private long productId;
    private String productCode;
    private String name;
    private double cost;

    public Product(ProductForm productForm) {
        this.name=productForm.getName();
    }

    public Product() {
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
