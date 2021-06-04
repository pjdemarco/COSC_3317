public class Square extends TwoDimensionalShape {

    private double side;

    public Square(double s) {
        if (s > 0) {
            this.side = s;
            super.shapeName = "Square";
            super.shapeType = "Two Dimensional Shape";
        } else {
            System.out.println("Side must be greater than 0.");
        }
    }

    public double getArea() {
        return this.side * this.side;
    }

    public String toString() {
        return getType() + " " + getName() + " has a side of " + this.side + " and an area of " + getArea();
    }
}
