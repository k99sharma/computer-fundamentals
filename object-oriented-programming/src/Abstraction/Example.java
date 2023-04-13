package Abstraction;

/**
 * Abstraction is one of principle of Object-Oriented Programming
 *
 * It means hiding the complex details of how something works and providing a simplified, easy-to-understand interface that can be used
 * to interact with it. It helps to manage complexity and makes code easier to maintain and modify over time.
 */

public class Example {
    public interface Shape {
        public double getArea();
    }

    public static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }
    }

    public static class Rectangle implements Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 5);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}
