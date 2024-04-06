package geometry;

public class ColoredCircle extends Circle {

    private String color;
    public ColoredCircle(Point center, double radius, String color) {
        super(center, radius);
        this.color = color;
    }

    public Point getCenter() {
        return super.getCenter();
    }

    public String getColor(){
        return color;
    }


}
