public class Cube extends ThreeDimensionalShape {

    private double side;

    public Cube(double s) {
        if (s > 0) {
            this.side = s;
            super.shapeName = "Cube";
            super.shapeType = "Three Dimensional Shape";
        } else {
            System.out.println("Side must be greater than 0.");
        }
    }

    public double getArea() {
        return 6 * this.side * this.side;
    }

    public double getVolume() {
        return this.side * this.side * this.side;
    }

    public String toString() {
        return getType() + " " + getName() + " has a side of " + this.side + ", a surface area of " + getArea() + ", and a volume of " + getVolume();
    }
}
