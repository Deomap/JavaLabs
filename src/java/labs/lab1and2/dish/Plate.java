package java.labs.lab1and2.dish;

import java.labs.lab1and2.dish.Dish;

public class Plate extends Dish {
    private double depth;

    public Plate(int cost, double depth) {
        super(cost, "plate");
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void displayInfo() {
        System.out.println("Cost: " + getCost() + ", type: " + getType() + ", depth: " + depth);
    }
}
