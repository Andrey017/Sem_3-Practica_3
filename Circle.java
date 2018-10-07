package ru.mirea;

public class Circle extends Shape {
    public double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return (radius*3.14);
    }

    @Override
    double getPerimeter() {
        return (2*3.14*radius);
    }

    @Override
    public String toString() {
        return "Shape: circle, color: " + this.getColor() + " filled: " + this.isFilled();
    }
}
