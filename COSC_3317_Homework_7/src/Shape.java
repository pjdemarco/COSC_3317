public abstract class Shape {

    protected String shapeName;
    private int xPosition;
    private int yPosition;

    public Shape() {
        this.xPosition = 0;
        this.yPosition = 0;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public abstract double getArea();

    public String getName() {
        return shapeName;
    }

    public String toString() {
        return String.format("%s ", getName());
    }
}
