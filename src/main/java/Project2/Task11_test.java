package Project2;


public class Task11_test {
    public static void main(String[] args) {

        Circle circle = new Circle(12);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println();


        Square square = new Square(32);
        System.out.println("Square Area= " + square.calculateArea());
        System.out.println("Square Perimeter= " + square.calculatePerimeter());
    }
}
