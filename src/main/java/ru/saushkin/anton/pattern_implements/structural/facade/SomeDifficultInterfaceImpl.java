package ru.saushkin.anton.pattern_implements.structural.facade;

public class SomeDifficultInterfaceImpl implements SomeDifficultInterface {

    private String someResult = "";

    @Override
    public void doItOnce() {
        someResult = concatenateWithSpace("doItOnce");
    }

    @Override
    public void doTwo() {
        someResult = concatenateWithSpace("doTwo");
    }

    private String concatenateWithSpace(String adding) {
        return someResult.equals("") ? adding : someResult + " " + adding;
    }

    @Override
    public String getResult() {
        return someResult;
    }
}
