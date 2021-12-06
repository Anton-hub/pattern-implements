package ru.saushkin.anton.pattern_implements.structural.flyweight;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private final Map<Class<? extends Flyweight>, Flyweight> flyweightPool = new HashMap<>();

    @SneakyThrows
    public Flyweight getFlyweight(Class<? extends Flyweight> type) {
        if (flyweightPool.containsKey(type)) {
            return flyweightPool.get(type);
        } else {
            Constructor<? extends Flyweight> constructor = type.getDeclaredConstructor();
            Flyweight instance = constructor.newInstance();
            flyweightPool.put(type, instance);
            return instance;
        }
    }
}
