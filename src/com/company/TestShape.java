package com.company;

public class TestShape {
    public void test() {
        Shape shape = new Circle(12.2, "green", false);
        System.out.println(shape);
        System.out.printf(("%.2f%n"), shape.getArea());
        System.out.printf(("%.2f%n"), shape.getPerimeter());
        System.out.println(shape.getColor());
        System.out.println(shape.isFilled());
//        System.out.println(shape.getRadius());        // Данного метода нет в классе Shape

        Circle circle = (Circle) shape;
        System.out.println("\n" + circle);
        System.out.printf(("%.2f%n"), circle.getArea());
        System.out.printf(("%.2f%n"), circle.getPerimeter());
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        System.out.println(circle.getRadius());

//        Shape shape1 = new Shape();     // "Абстрактный класс не может содержать какие-либо объекты" from metodi4ka

        Shape shape2  = new Rectangle(2.5, 3, "red", true);
        System.out.println("\n" + shape2);
        System.out.printf(("%.2f%n"), shape2.getArea());
        System.out.printf(("%.2f%n"), shape2.getPerimeter());
        System.out.println(shape2.getColor());
//        System.out.println(shape2.getLength());         // Данного метода нет в классе Shape

        Rectangle rectangle = (Rectangle) shape2;
        System.out.println("\n" + rectangle);
        System.out.printf(("%.2f%n"), rectangle.getArea());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getLength());

        Shape shape3 = new Square(5);
        System.out.println("\n" + shape3);
        System.out.printf(("%.2f%n"), shape3.getArea());
        System.out.println(shape3.getColor());
//        System.out.println(shape3.getSide());       // Данного метода нет в классе Shape

        Rectangle rectangle1 = (Rectangle) shape3;
        System.out.println("\n" + rectangle1);
        System.out.printf(("%.2f%n"), rectangle1.getArea());
        System.out.println(rectangle1.getColor());
//        System.out.println(rectangle1.getSide());       // Данного поля нет в классе Rectangle
        System.out.println(rectangle1.getLength());

        Square square = (Square) rectangle1;
        System.out.println("\n" + square);
        System.out.printf(("%.2f%n"), square.getArea());
        System.out.println(square.getColor());
        System.out.println(square.getSide());
        System.out.println(square.getLength());
    }
}
