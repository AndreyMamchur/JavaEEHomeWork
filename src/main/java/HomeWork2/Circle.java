package HomeWork2;

public class Circle extends Figure {
    private double radius;
    private Rectangle rectangle;
    private Triangle triangle;

    public Circle() {
    }

    public Circle(Rectangle rectangle, Triangle triangle) {
        this.rectangle = rectangle;
        this.triangle = triangle;
    }

    public Circle(double radius, Rectangle rectangle, Triangle triangle) {
        this.radius = radius;
        this.rectangle = rectangle;
        this.triangle = triangle;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", rectangle=" + rectangle +
                ", triangle=" + triangle +
                '}';
    }

    public double calculateAreaOfTheFullFigure() {
        return Math.PI*Math.pow(radius, 2);
    }

    public double calculateAreaOfTheFigure() {
        return (calculateAreaOfTheFullFigure() - rectangle.calculateAreaOfTheFigure() - triangle.calculateAreaOfTheFigure());
    }

    public void init(){
        System.out.println("I’m a Circle");
    }
}
