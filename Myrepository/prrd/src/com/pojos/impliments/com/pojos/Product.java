package com.pojos.impliments.com.pojos;

public class Product
{
    private String productId;
    private String productName;
    private double sellingPrice;
    private double availableQuantity;

    private Item item;

    public Product(String productId, String productName, double sellingPrice, double availableQuantity, Item item) {
        this.productId = productId;
        this.productName = productName;
        this.sellingPrice = sellingPrice;
        this.availableQuantity = availableQuantity;
        this.item = item;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(double availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", availableQuantity=" + availableQuantity +
                ", item=" + item +
                '}';
    }
}
