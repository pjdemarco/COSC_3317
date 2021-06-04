public class Circle extends Point {

    private double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        super(0,0);
        this.radius = radius;
    }

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    public double getCircumference() {
        return getDiameter() * Math.PI;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "x = " + getX() + " y = " + getY() + " radius = " + this.radius;
    }
}
