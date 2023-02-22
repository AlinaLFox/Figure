package shape;

public class Sphere extends ThreeDimensionalShape{

    private double Pi = 3.14;
    private double radius = 5;
    private double area;
    private double volume;
    @Override
    public double calculateArea() {
      return  area = 4 * Pi * radius * radius;
    }

    @Override
    public String shapeType() {
        return "Sphere";
    }

    @Override
    public double calculateVolume() {
      return  volume = 4 / 3 * Pi * radius * radius * radius;
    }
}
