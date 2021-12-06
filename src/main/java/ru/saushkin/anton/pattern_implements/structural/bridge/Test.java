package ru.saushkin.anton.pattern_implements.structural.bridge;

import ru.saushkin.anton.pattern_implements.structural.bridge.abstraction.Circle;
import ru.saushkin.anton.pattern_implements.structural.bridge.abstraction.Rectangle;
import ru.saushkin.anton.pattern_implements.structural.bridge.abstraction.Shape;
import ru.saushkin.anton.pattern_implements.structural.bridge.implementor.Blue;
import ru.saushkin.anton.pattern_implements.structural.bridge.implementor.Colour;
import ru.saushkin.anton.pattern_implements.structural.bridge.implementor.Red;

public class Test {
    public static void main(String[] args) {
        // Реализации - имеют свою отдельную иерархию, и могут расширяться отдельно/независимо от абстракций
        Colour red = new Red();
        Colour blue = new Blue();

        // Абстракции - имеют свою иерархию которая не зависит/не влияет на реализации, но при этом использует их
        Shape circle = new Circle(red);
        Shape rectangle = new Rectangle(blue);

        // Реализация цвета фигуры не зависит/влияет на фигуру
        System.out.println(circle.constructShape());
        System.out.println(rectangle.constructShape());

        // Пример круга с другой реализацией цвета
        Shape blueCircle = new Circle(blue);
        System.out.println(blueCircle.constructShape());
    }
}
