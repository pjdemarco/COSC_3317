public class CylinderTest {

    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("Point 1");
        p1.setX(21);
        p1.setY(-15);
        System.out.println(p1.toString());
        System.out.println("**********************");

        Point p2 = new Point(3,17);
        System.out.println("Point 2");
        System.out.println(p2.toString());
        System.out.println("**********************");

        Circle c1 = new Circle();
        c1.setX(21);
        c1.setY(-15);
        c1.setRadius(19);
        System.out.println("Circle 1");
        System.out.println(c1.toString());
        System.out.println("Diameter: " + c1.getDiameter());
        System.out.println("Circumference: " + c1.getCircumference());
        System.out.println("Area: " + c1.getArea());
        System.out.println("**********************");

        Circle c2 = new Circle(3, 17, 7);
        System.out.println("Circle 2");
        System.out.println(c2.toString());
        System.out.println("Diameter: " + c2.getDiameter());
        System.out.println("Circumference: " + c2.getCircumference());
        System.out.println("Area: " + c2.getArea());
        System.out.println("**********************");

        Cylinder cy1 = new Cylinder();
        cy1.setX(21);
        cy1.setY(-15);
        cy1.setRadius(19);
        cy1.setHeight(4);
        System.out.println("Cylinder 1");
        System.out.println(cy1.toString());
        System.out.println("Diameter: " + cy1.getDiameter());
        System.out.println("Circumference: " + cy1.getCircumference());
        System.out.println("Area: " + cy1.getArea());
        System.out.println("Volume: " + cy1.getVolume());
        System.out.println("**********************");

        Cylinder cy2 = new Cylinder(3, 17, 7, 100);
        System.out.println("Cylinder 2");
        System.out.println(cy2.toString());
        System.out.println("Diameter: " + cy2.getDiameter());
        System.out.println("Circumference: " + cy2.getCircumference());
        System.out.println("Area: " + cy2.getArea());
        System.out.println("Volume: " + cy2.getVolume());
        System.out.println("**********************");

    }
}
