package org.evil.domain;

public class UserReserve {
    private Furniture furniture;
    private int quantity;

    public UserReserve() {
        this.furniture = new Furniture();
        this.quantity = 0;
    }

    public UserReserve(Furniture furniture, int quantity) {
        this.furniture = furniture;
        this.quantity = quantity;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
