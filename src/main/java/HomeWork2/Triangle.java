package HomeWork2;

public class Triangle {
    private double lengthOfSide1;
    private double lengthOfSide2;
    private double lengthOfSide3;
    private Rectangle rectangle;

    public Triangle() {
    }

    public Triangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Triangle(double lengthOfSide1, double lengthOfSide2, double lengthOfSide3, Rectangle rectangle) {
        this.lengthOfSide1 = lengthOfSide1;
        this.lengthOfSide2 = lengthOfSide2;
        this.lengthOfSide3 = lengthOfSide3;
        this.rectangle = rectangle;
    }

    public double getLengthOfSide1() {
        return lengthOfSide1;
    }

    public void setLengthOfSide1(double lengthOfSide1) {
        this.lengthOfSide1 = lengthOfSide1;
    }

    public double getLengthOfSide2() {
        return lengthOfSide2;
    }

    public void setLengthOfSide2(double lengthOfSide2) {
        this.lengthOfSide2 = lengthOfSide2;
    }

    public double getLengthOfSide3() {
        return lengthOfSide3;
    }

    public void setLengthOfSide3(double lengthOfSide3) {
        this.lengthOfSide3 = lengthOfSide3;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "lengthOfSide1=" + lengthOfSide1 +
                ", lengthOfSide2=" + lengthOfSide2 +
                ", lengthOfSide3=" + lengthOfSide3 +
                ", rectangle=" + rectangle +
                '}';
    }
}
