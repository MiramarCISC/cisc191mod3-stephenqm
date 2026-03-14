package edu.sdccd.cisc191;

import java.util.Objects;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        if (radius <= 0) {

            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    @Override
    public double area() {

        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {

        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return this.name.equals(other.name) && Double.compare(this.radius, other.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius);
    }
}
