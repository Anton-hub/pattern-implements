package ru.saushkin.anton.pattern_implements.structural.bridge.implementor;

public class Blue implements Colour {

    private final String colour = "blue";

    @Override
    public String paint() {
        return colour;
    }
}
