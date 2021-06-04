public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        super(0,0,0);
        this.height = 0;
    }

    public Cylinder(int x, int y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return  (2 * super.getArea()) + (getCircumference() * this.height);
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public String toString() {
        return "x = " + getX() + " y = " + getY() + " radius = " + getRadius() + " height = " + this.height;
    }
}
