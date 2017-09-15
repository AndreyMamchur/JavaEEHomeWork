package homework2;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public double calculateAreaOfTheFullFigure() {
        return length*width;
    }

    public double calculateAreaOfTheFigure() {
        return calculateAreaOfTheFullFigure();
    }

    public void init(){
        System.out.println("I’m a Rectangle");
    }
}
