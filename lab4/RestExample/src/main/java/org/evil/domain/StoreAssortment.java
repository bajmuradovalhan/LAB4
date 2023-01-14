package org.evil.domain;

public class StoreAssortment {
    private Furniture[] furtnitures;
    private int[] quantity;

    public StoreAssortment(Furniture[] furtnitures, int[] quantity) {
        this.furtnitures = furtnitures;
        this.quantity = quantity;
    }

    public StoreAssortment() {
    }

    public void setQuantityFromIndex(int index, int value) {
        try {
            quantity[index] = value;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Furniture[] getFurnitures() {
        return furtnitures;
    }

    public void setFurnitures(Furniture[] furtnitures) {
        this.furtnitures = furtnitures;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }
}
