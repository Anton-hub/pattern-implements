package ru.saushkin.anton.pattern_implements.structural.flyweight;

public class RedFlyweight implements Flyweight {
    // Внутреннее состояние
    private final static String COLOUR = "RED";

    @Override
    public String getResult(String externalContext) {
        return COLOUR + " " + externalContext;
    }
}
