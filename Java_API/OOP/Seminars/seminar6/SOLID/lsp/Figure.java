package lsp;

public abstract class Figure {
    protected float width;
    protected float height;

    public float getWidth() {
        return width;
    }

    public abstract void setWidth(float width);

    public float getHeight() {
        return height;
    }

    public abstract void setHeight(float height);

    public float getArea() {
        return width * height;
    }

}
