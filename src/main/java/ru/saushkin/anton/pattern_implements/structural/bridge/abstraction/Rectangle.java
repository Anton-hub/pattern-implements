package ru.saushkin.anton.pattern_implements.structural.bridge.abstraction;

import ru.saushkin.anton.pattern_implements.structural.bridge.implementor.Colour;

public class Rectangle implements Shape {

    private final String shapeType = "Rectangle";
    private final Colour colour;

    public Rectangle(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String constructShape() {
        return shapeType + " " + colour.paint();
    }
}
