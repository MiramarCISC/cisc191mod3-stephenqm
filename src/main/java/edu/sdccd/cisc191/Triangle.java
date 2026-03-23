package edu.sdccd.cisc191;

import java.util.Objects;

public class Triangle extends Shape implements Measurable { /// added implementation of Measurable interface
    /// made variables final
    private final double a;
    private final double b;
    private final double c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("All sides must be positive");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Sides do not form a valid triangle");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSideA() { return a; }
    public double getSideB() { return b; }
    public double getSideC() { return c; }

    @Override
    public double area() {
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); /// Good work with the Heron's formula
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false; /// fixed small error by using getClass instead of instanceOf
        Triangle other = (Triangle) obj;
        /// changed to this.name.equals(other.name) to Objects.equals(this.name, other.name) so that it doesn't crash when name is null
        return Objects.equals(this.name, other.name)
                && Double.compare(this.a, other.a) == 0
                && Double.compare(this.b, other.b) == 0
                && Double.compare(this.c, other.c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, a, b, c);
    }
}
