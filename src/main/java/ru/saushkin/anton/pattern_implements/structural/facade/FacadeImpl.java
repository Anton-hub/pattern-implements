package ru.saushkin.anton.pattern_implements.structural.facade;

public class FacadeImpl implements Facade{

    SomeDifficultInterface someDifficultInterface;
    AnotherOneInterface anotherOneInterface;

    public FacadeImpl(SomeDifficultInterface someDifficultInterface, AnotherOneInterface anotherOneInterface) {
        this.someDifficultInterface = someDifficultInterface;
        this.anotherOneInterface = anotherOneInterface;
    }

    @Override
    public String getResult() {
        someDifficultInterface.doItOnce();
        someDifficultInterface.doTwo();
        return someDifficultInterface.getResult();
    }

    @Override
    public String getAnythingResult() {
        anotherOneInterface.doAnythingForResult();
        return anotherOneInterface.getAnythingResult();
    }
}
