package edu.sdccd.cisc191;

import java.util.Objects;

public class Circle extends Shape implements Measurable { /// added implementation of Measurable interface
    private final double radius; /// made radius a final variable

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
        if (obj == null || getClass() != obj.getClass()) return false; /// fixed small error by using getClass instead of instanceOf
        Circle other = (Circle) obj;
        /// changed to this.name.equals(other.name) to Objects.equals(this.name, other.name) so that it doesn't crash when name is null
        return Objects.equals(this.name, other.name) && Double.compare(this.radius, other.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius);
    }
}
