package com.company;

public class Match {
    public void test() {
        Ball ball1 = new Ball("red");
        Ball ball2 = new Ball();
        Ball ball3 = new Ball(100, "black");

        ball1.setWeight(200);
        ball2.setWeight(300);
        ball2.setColor("green");

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
        System.out.println((String) (String.format(("r = %.2f m"), ball3.radius())));

        ball3.setColor("yellow");

        System.out.println(ball3.toString());
    }
}
