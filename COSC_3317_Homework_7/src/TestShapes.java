public class TestShapes {

    public static void main(String[] args) {
        Shape[] arrayOfShapes = new Shape[4];
        arrayOfShapes[0] = new Square(0.25);
        arrayOfShapes[1] = new Circle(2.5);
        arrayOfShapes[2] = new Sphere(15.3);
        arrayOfShapes[3] = new Cube(2.5);

        for (Shape shape : arrayOfShapes) {
            System.out.println(shape);
        }
    }
}
