package ru.saushkin.anton.pattern_implements.structural.bridge.implementor;

public class Red implements Colour {
    private final String colour = "red";

    @Override
    public String paint() {
        return colour;
    }
}
