package shape;

public class Square extends TwoDimensionalShape{
    private int area;
    private int sideLength = 6;


    @Override
    public double calculateArea() {
       return area = sideLength * sideLength;
    }

    @Override
    public String shapeType() {
        return "Square";
    }

}
