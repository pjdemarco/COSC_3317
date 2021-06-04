public class Circle extends TwoDimensionalShape {

    private double radius;

    public Circle(double r) {
        if (r > 0) {
            this.radius = r;
            super.shapeName = "Circle";
            super.shapeType = "Two Dimensional Shape";
        } else {
            System.out.println("Radius must be greater than 0.");
        }
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return getType() + " " + getName() + " has a radius of " + this.radius + " and an area of " + getArea();
    }
}
