import shape.*;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Square square = new Square();
        Cube cube = new Cube();
        Sphere sphere = new Sphere();


        System.out.println("Shape type: " + circle.shapeType() + ", area = " + circle.calculateArea());
        System.out.println("Shape type: " + square.shapeType() + ", area = " + square.calculateArea());
        System.out.println("Shape type: " + cube.shapeType() + ", area = " + cube.calculateArea() + ", volume =" + cube.calculateVolume());
        System.out.println("Shape type: " + sphere.shapeType() + ", area = " + sphere.calculateArea() + ", volume =" + sphere.calculateVolume());


    }
}