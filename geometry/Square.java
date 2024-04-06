package geometry;

public class Square extends Rectangle {
    public Square(double width){
        super(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }

    public double getWidth(){
        return width;
    }
}
