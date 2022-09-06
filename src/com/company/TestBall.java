package com.company;

public class TestBall {
    public void test() {
        Ball ball1 = new Ball(-4, 6.2);
        Ball ball2 = new Ball();
        ball2.setX(1);
        ball2.setY(1);

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());

        ball1.setXY(0, 0);
        ball2.move(1, -1.5);

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
    }
}
