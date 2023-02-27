package ru.saushkin.anton.pattern_implements.behavioural.observer.impl;

import ru.saushkin.anton.pattern_implements.behavioural.observer.framework.Observer;
import ru.saushkin.anton.pattern_implements.behavioural.observer.framework.Subject;

import java.util.Optional;

public class SubjectImpl implements Subject {

    private Observer observer;
    private String state = "default";

    @Override
    public void attach(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void detach() {
        observer = null;
    }

    @Override
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        Optional.ofNullable(observer)
                .ifPresent(o -> o.notifyObserver(this));
    }
}