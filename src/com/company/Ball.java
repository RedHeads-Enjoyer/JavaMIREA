package com.company;

public class Ball {
    private double x = 0, y = 0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x = this.x + xDisp;
        this.y = this.y + yDisp;
    }

    public String toString() {
        return "Ball @ (" + this.x + ", " + this.y + ")";
    }
}
