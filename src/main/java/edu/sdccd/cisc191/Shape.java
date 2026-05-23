package edu.sdccd.cisc191;

public abstract class Shape implements Comparable<Shape>, Measurable {

    protected String name;

    public Shape(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }

        this.name = name.trim();
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract double area();

    public abstract double perimeter();

    public String describe() {
        return getClass().getSimpleName() + "[" + name + "]";
    }

    @Override
    public int compareTo(Shape other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return describe() + " area=" + String.format("%.2f", area());
    }
}