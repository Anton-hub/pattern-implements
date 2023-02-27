package ru.saushkin.anton.pattern_implements.behavioural.observer.impl;

import ru.saushkin.anton.pattern_implements.behavioural.observer.framework.Recipient;

public class Recipient1 implements Recipient {
    @Override
    public void update(String news) {
        System.out.println(this.getClass().getSimpleName() + " получил уведомление: '" + news + "'");
    }
}