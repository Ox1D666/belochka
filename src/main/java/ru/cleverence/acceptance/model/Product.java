package ru.cleverence.acceptance.model;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private String desc;

    public Product(int id, String name, int quantity, String desc) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
