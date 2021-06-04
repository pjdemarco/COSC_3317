public abstract class TwoDimensionalShape extends Shape {

    protected String shapeType;

    public abstract double getArea();

    public String getType() {
        return shapeType;
    }

    public String toString() {
        return String.format("%s %s ", getType(), getName());
    }

}
