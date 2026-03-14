package edu.sdccd.cisc191;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("A", 2));
        shapes.add(new Rectangle("B", 3, 4));
        shapes.add(new Triangle("C", 3, 4, 5));

        // Polymorphic loop
        System.out.println("=== All Shapes ===");
        for (Shape s : shapes) {
            System.out.println(s.describe() + " area=" + s.area());
        }

        // equals comparison
        System.out.println("Equality Check");
        Circle c1 = new Circle("A", 2);
        Circle c2 = new Circle("A", 2);
        System.out.println("c1.equals(c2): " + c1.equals(c2));

        // Sort by area using Comparator
        shapes.sort(Comparator.comparingDouble(Shape::area));
        System.out.println("Sorted by Area");
        shapes.forEach(System.out::println);

        // Sort by name using Comparable
        Collections.sort(shapes);
        System.out.println("Sorted by Name");
        shapes.forEach(System.out::println);
    }
}
 