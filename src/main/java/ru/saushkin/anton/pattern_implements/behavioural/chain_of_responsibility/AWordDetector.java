package ru.saushkin.anton.pattern_implements.behavioural.chain_of_responsibility;

public class AWordDetector extends Handler {
    @Override
    public boolean handle(String data) {
        return data.contains("A") ? true : handleNext(data);
    }
}
