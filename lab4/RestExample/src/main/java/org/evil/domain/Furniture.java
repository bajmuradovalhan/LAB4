package org.evil.domain;


public class Furniture {
    private String id;
    private String company;
    private String type;
    private String name;
    private String weight;
    private Double price;

    public Furniture() {
        this.id = "0000";
        this.company = "";
        this.type = "";
        this.name = "";
        this.weight = "";
        this.price = 0.0;
    }

    @Override
    public String toString() {
        return company + " " + type + " " + name
                + " " + weight + " "  + price + "P";
    }

    public Furniture(String id, String company, String type, String name, String weight, double price) {
        this.id = id;
        this.company = company;
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}