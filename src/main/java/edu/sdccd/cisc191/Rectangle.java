package edu.sdccd.cisc191;

import java.util.Objects;

public class Rectangle extends Shape implements Measurable { /// added implementation of Measurable interface
/// made variables final
    private final double width;
    private final double height;

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
        if (obj == null || getClass() != obj.getClass()) return false; /// fixed small error by using getClass instead of instanceOf
        Rectangle other = (Rectangle) obj;
        /// changed to this.name.equals(other.name) to Objects.equals(this.name, other.name) so that it doesn't crash when name is null
        return Objects.equals(this.name, other.name)
                && Double.compare(this.width, other.width) == 0
                && Double.compare(this.height, other.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height);
    }
}