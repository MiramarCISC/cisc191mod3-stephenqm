package edu.sdccd.cisc191;

public abstract class Shape implements Comparable<Shape> {
    protected String name;

    public Shape(String name) {
        if (name == null || name.isEmpty()) {

            throw new IllegalArgumentException("Name cannot be null/empty");
        }

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    public String describe() {

        return getClass().getSimpleName() + "[" + name + "]";
    }

    /// changed it to compare the areas rather than names
    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.area(), other.area());
    }

    @Override
    public String toString() {
        /// Nice work!!
        return describe() + " area=" + String.format("%.2f", area());
    }
}