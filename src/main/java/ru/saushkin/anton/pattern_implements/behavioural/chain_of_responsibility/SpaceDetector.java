package ru.saushkin.anton.pattern_implements.behavioural.chain_of_responsibility;

public class SpaceDetector extends Handler {
    @Override
    public boolean handle(String data) {
        return data.contains(" ") ? true : handleNext(data);
    }
}
