package edu.sdccd.cisc191;

import java.util.Objects;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be positive");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {

        return width;
    }

    public double getHeight() {

        return height;
    }

    @Override
    public double area() {

        return width * height;
    }

    @Override
    public double perimeter() {

        return 2 * (width + height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return this.name.equals(other.name)
                && Double.compare(this.width, other.width) == 0
                && Double.compare(this.height, other.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height);
    }
}