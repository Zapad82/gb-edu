package java;
import java.util.*;

interface Shape {
    float getArea ();
}

class SquareShape implements Shape {
    float side;

    public SquareShape (float side) {
        this.side = side;
    }

    @Override
    public float getArea () { return side * side; }
}

class CircleShape implements Shape {
    float radius;

    public CircleShape(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Iterable<Shape> shapes = Arrays.asList (
            new SquareShape (1),
            new CircleShape (1)
        );
        for (Shape shape : shapes)
            System.out.println(shape.getArea ());
    }
}
