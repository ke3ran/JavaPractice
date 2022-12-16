package ru.ke3ran.metod2.lab12.shape;

public abstract class Shape {

    protected long color;
    protected Integer x;
    protected Integer y;

    protected Shape(long color, Integer x, Integer y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
