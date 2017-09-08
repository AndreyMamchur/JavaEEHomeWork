package HomeWork2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Rectangle rectangle = (Rectangle) context.getBean("rectangle");
        Triangle triangle = (Triangle) context.getBean("triangle");
        Circle circle = (Circle) context.getBean("circle");

        List<Figure> listOfFigure = new ArrayList<>();
        listOfFigure.add(rectangle);
        listOfFigure.add(triangle);
        listOfFigure.add(circle);

        double sumOfAllFigure = 0;
        for (Figure figure : listOfFigure) {
            sumOfAllFigure += figure.calculateAreaOfTheFigure();
        }

        System.out.format("Sum of all figure is %.2f%n", sumOfAllFigure);
        System.out.format("Area of circle is %.2f%n", circle.calculateAreaOfTheFullFigure());
    }
}
