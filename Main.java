import geometry.*;
public class zad3 {
    public static void main(String[] args) {
        Point point = new Point(3.0, 5.0);
        ColoredCircle coloredCircle = new ColoredCircle(point, 6, "Yellow");

        System.out.println("Radius of circle: " + coloredCircle.getRadius());
        System.out.println("Center of circle: " + "(" + coloredCircle.getCenter().getX() + "," + coloredCircle.getCenter().getY() + ")");
        System.out.println("Circumference of a circle: " + coloredCircle.calculatePerimeter());
        System.out.println("Color of colored circle: " + coloredCircle.getColor());

    }
}
