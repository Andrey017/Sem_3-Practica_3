package ru.mirea;

public class Main {

    public static void main(String[] args) {
        Shape shape_1 = new Circle(5.5, "Red", false);
        System.out.println(shape_1);
        System.out.println(shape_1.getArea());
        System.out.println(shape_1.getPerimeter());
        System.out.println(shape_1.getColor());
        System.out.println(shape_1.isFilled());
        System.out.println(((Circle) shape_1).getRadius());

        Circle circle_1 = (Circle)shape_1;
        System.out.println(circle_1);
        System.out.println(circle_1.getArea());
        System.out.println(circle_1.getPerimeter());
        System.out.println(circle_1.getColor());
        System.out.println(circle_1.isFilled());
        System.out.println(circle_1.getRadius());

        //Shape shape_2 = new Shape();

        Shape shape_3 = new Rectangle(2.0, 3.0, "Blue", false);
        System.out.println(shape_3);
        System.out.println(shape_3.getArea());
        System.out.println(shape_3.getPerimeter());
        System.out.println(shape_3.getColor());
        System.out.println(((Rectangle) shape_3).getLength());

        Rectangle rectangle_1 = (Rectangle)shape_3;
        System.out.println(rectangle_1);
        System.out.println(rectangle_1.getArea());
        System.out.println(rectangle_1.getColor());
        System.out.println(rectangle_1.getLength());

        Shape shape_4 = new Square(6.6);
        System.out.println(shape_4);
        System.out.println(shape_4.getArea());
        System.out.println(shape_4.getColor());
        System.out.println(((Square) shape_4).getSide());

        Rectangle rectangle_2 = (Rectangle)shape_4;
        System.out.println(rectangle_2);
        System.out.println(rectangle_2.getArea());
        System.out.println(rectangle_2.getColor());
        System.out.println(rectangle_2.getLength());

        Square square_1 = (Square)rectangle_2;
        System.out.println(square_1);
        System.out.println(square_1.getArea());
        System.out.println(square_1.getColor());
        System.out.println(square_1.getSide());
        System.out.println(square_1.getLength());

    }
}
