package srp;

public class GraphicRectangle extends Rectangle {

    public GraphicRectangle(int width, int height) {
        super(width, height);
    }

    // графическая задача
    public void draw() {
        GraphicsLibrary.drawRectangle(0, 0, width, height, '#');
    }
}
