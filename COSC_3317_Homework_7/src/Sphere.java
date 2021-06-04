public class Sphere extends ThreeDimensionalShape {

    private double radius;

    public Sphere(double r) {
        if (r > 0) {
            this.radius = r;
            super.shapeName = "Sphere";
            super.shapeType = "Three Dimensional Shape";
        } else {
            System.out.println("Radius must be greater than 0.");
        }
    }

    public double getArea() {
        return 4 * Math.PI * this.radius * this.radius;
    }

    public double getVolume() {
        return (4/3) * Math.PI * this.radius * this.radius * this.radius;
    }

    public String toString() {
        return getType() + " " + getName() + " has a radius of " + this.radius + ", a surface area of " + getArea() + ", and a volume of " + getVolume();
    }
}
