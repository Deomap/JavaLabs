package java.labs.lab3;

public class Square extends Shape {
    double side;

    public Square() {
        super("blue", false);
    }

    public Square(double side, double length){
        super("blue", false);
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.side + ", color: " + this.color;
    }
}
