import geometry.*;

public class zad2 {
    public static void main(String[] args) {

        Point point = new Point(3.0, 4.0);
        Circle circle = new Circle(point, 5.0);

        System.out.println("Radius of circle: " + circle.getRadius());
        System.out.println("Center of circle: " + "(" + circle.getCenter().getX() + "," + circle.getCenter().getY() + ")");
        System.out.println("Circumference of a circle: " + circle.calculatePerimeter());

        System.out.printf("%n%n");
        System.out.println("Center of circle: " + circle.getCenter().toString());

    }

}
