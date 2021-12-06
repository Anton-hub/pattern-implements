package ru.saushkin.anton.pattern_implements.structural.flyweight;

public class BlueFlyweight implements Flyweight {
    // Внутреннее состояние
    private final static String COLOUR = "BLUE";

    @Override
    public String getResult(String externalContext) {
        return COLOUR + " " + externalContext;
    }
}