package ocp;

public class ColoredSquareShape implements Shape {

    private char color;

    public ColoredSquareShape(char color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("%c%c%c\n", color, color, color);
        System.out.printf("%c%c%c\n", color, color, color);
        System.out.printf("%c%c%c\n", color, color, color);
        System.out.println();
    }
}
