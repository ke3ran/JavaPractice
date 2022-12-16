package ru.ke3ran.metod1.lab1.ex1;

public class Ball {

    private int speed;

    public Ball(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "speed=" + speed +
                '}';
    }
}
