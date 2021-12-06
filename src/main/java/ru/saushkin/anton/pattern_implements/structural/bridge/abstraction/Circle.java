package ru.saushkin.anton.pattern_implements.structural.bridge.abstraction;

import ru.saushkin.anton.pattern_implements.structural.bridge.implementor.Colour;

public class Circle implements Shape {

    private final String shapeType = "Circle";
    private final Colour colour;

    public Circle(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String constructShape() {
        return shapeType + " " + colour.paint();
    }
}
