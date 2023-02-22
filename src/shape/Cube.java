package shape;

public class Cube extends ThreeDimensionalShape{

    private int area;
    private int sideLength = 4;
    private double volume;

    @Override
    public double calculateArea() {
       return area = 6 * sideLength;
    }

    @Override
    public String shapeType() {
        return "Cube";
    }

    @Override
    public double calculateVolume() {
       return volume = sideLength * sideLength * sideLength;
    }
}
