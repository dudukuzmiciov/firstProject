package com.class21.SuperKeyword;

public class ShapeClass {
    /*Write program: Shape class has a constructor that takes the radius
     and has a subclass as  circle class. In circle class create a method
     to calculate the area of circle. Test your code
     */

        double radius;

        public ShapeClass(double radius) {
            this.radius = radius;
        }
    }

    class Circle extends ShapeClass {
        public Circle(double radius) {
            super(radius);
        }

        void area() {
            System.out.println(3.14 * radius * radius);
        }
    }

    class tester {
        public static void main(String[] args) {
            new Circle(4).area();
        }
}
