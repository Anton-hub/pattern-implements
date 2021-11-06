package ru.saushkin.anton.pattern_implements.creational.singleton;

import lombok.SneakyThrows;

public class SynchronizedSingleton {
    private static volatile SynchronizedSingleton instance;

    private SynchronizedSingleton(){}

    @SneakyThrows
    public static SynchronizedSingleton getInstance() {
        if (instance == null) {
            synchronized (SynchronizedSingleton.class) {
                if (instance == null) {
                    Thread.sleep(1000);
                    instance = new SynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
