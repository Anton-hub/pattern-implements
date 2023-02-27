package ru.saushkin.anton.pattern_implements.behavioural.iterator;

import ru.saushkin.anton.pattern_implements.behavioural.iterator.framework.Iterator;
import ru.saushkin.anton.pattern_implements.behavioural.iterator.impl.ArrayIterator;

public class Test {
    public static void main(String[] args) {
        String[] stringArray = {"1", "2", "3"};
        Iterator<String> iterator = new ArrayIterator<>(stringArray);
        while ( ! iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }

    }
}
