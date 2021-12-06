package ru.saushkin.anton.pattern_implements.structural.facade;

import java.util.Random;

public class AnotherOneInterfaceImpl implements AnotherOneInterface {

    private final Random random = new Random();
    private String result = "";

    @Override
    public void doAnythingForResult() {
        result = String.valueOf(random.nextInt());
    }

    @Override
    public String getAnythingResult() {
        return result;
    }
}
