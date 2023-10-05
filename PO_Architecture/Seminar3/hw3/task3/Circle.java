package PO_Architecture.Seminar3.hw3.task3;

public class Circle implements TwoDShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
