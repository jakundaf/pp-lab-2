import geometry.*;

public class zad4 {
    public static void main(String[] args) {
        Circle[] circles = {
                new Circle (new Point(1.0, 2.0),3.0),
                new ColoredCircle (new Point(4.0, 5.0), 2.5, "red"),
                new Circle (new Point(-1.0, 12.0), 55.5),
                new ColoredCircle (new Point(-1.0, 12.0), 55.5, "blue"),
        };

        int counter = 1;

        for (Circle x: circles){
            if (x instanceof ColoredCircle)
            {
                System.out.println("Color of colored circle number: " + counter + " is: " + ((ColoredCircle) x).getColor());
            }
            System.out.println("Area of circle number " + counter + " is: " + x.calculateArea());
            counter++;
        }

    }
}
