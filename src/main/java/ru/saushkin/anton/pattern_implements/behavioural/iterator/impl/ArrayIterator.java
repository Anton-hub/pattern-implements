package ru.saushkin.anton.pattern_implements.behavioural.iterator.impl;

import ru.saushkin.anton.pattern_implements.behavioural.iterator.framework.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private final T[] array;
    private int count = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public void first() {
        count = 0;
    }

    @Override
    public void next() {
        count++;
    }

    @Override
    public boolean isDone() {
        return count >= array.length;
    }

    @Override
    public T currentItem() {
        if (isDone()) {
            throw new IndexOutOfBoundsException();
        }
        return array[count];
    }
}
