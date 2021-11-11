package java.labs.lab1and2.dish;

public abstract class Dish {
    private double cost;
    private String type;

    public Dish(double cost, String type) {
        this.cost = cost;
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract public void displayInfo();
}
