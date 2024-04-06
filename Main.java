import geometry.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,2);

        System.out.println("Area of the rectangle is: " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle is: " + rectangle.calculatePerimeter());

    }
}
