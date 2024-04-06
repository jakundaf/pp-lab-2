import geometry.*;

public class zad4 {
    public static void main(String[] args) {
        Circle[] circles = {
                new Circle (new Point(1.0, 2.0),3.0),
                new Circle (new Point(4.0, 5.0), 2.5),
                new Circle (new Point(-1.0, 12.0), 55.5),
                new Circle (new Point(0, 5), -5),
        };

        ColoredCircle[] coloredCircles = {
                new ColoredCircle (new Point(1.0, 2.0), 5.0, "yellow"),
                new ColoredCircle (new Point(4.0, 5.0), 2.5, "red"),
                new ColoredCircle (new Point(-1.0, 12.0), 55.5, "blue"),
                new ColoredCircle (new Point(0, 5), -5, "black"),
        };

        int counter = 1;
        for (Circle x: circles){
            System.out.println("Area of circle number " + counter + " is: " + x.calculateArea());
            counter++;
        }

        System.out.printf("%n%n");
        counter = 1;

        for(ColoredCircle x: coloredCircles){
            if (x instanceof Circle){
                System.out.println("Color of colored circle number: " + counter + " is: " + x.getColor());
            }
            System.out.println("Area of circle number " + counter + " is: " + x.calculateArea());
            counter++;
        }

    }
}
