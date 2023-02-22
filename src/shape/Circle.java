package shape;

public class Circle extends TwoDimensionalShape {

    private double Pi = 3.14;
    private double radius = 3;
    private double area;

    @Override
    public double calculateArea() {
       return area = Pi * radius * radius;
    }

    @Override
    public String shapeType() {
        return "Circle";
    }
}
