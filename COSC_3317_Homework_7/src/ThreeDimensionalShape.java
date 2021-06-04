public abstract class ThreeDimensionalShape extends Shape {

    protected String shapeType;

    public abstract double getArea();

    public abstract double getVolume();

    public String getType() {
        return shapeType;
    }

    public String toString() {
        return String.format("%s %s ", getType(), getName());
    }
}
