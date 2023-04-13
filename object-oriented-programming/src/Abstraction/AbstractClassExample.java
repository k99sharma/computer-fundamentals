package Abstraction;

public class AbstractClassExample {
    abstract class Shape {
        private String color;

        public Shape(String color) {
            this.color = color;
        }

        public abstract double getArea();

        public String getColor() {
            return color;
        }
    }

    class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
        }

        public double getArea() {
            return length * width;
        }
    }

    public class Circle extends Shape {
        private double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public void main(String[] args) {
        Shape rect = new Rectangle("Red", 5, 10);
        Shape circle = new Circle("Blue", 2);

        System.out.println("Rectangle area: " + rect.getArea());
        System.out.println("Circle area: " + circle.getArea());
    }
}
