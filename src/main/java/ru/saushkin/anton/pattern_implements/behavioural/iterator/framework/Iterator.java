package ru.saushkin.anton.pattern_implements.behavioural.iterator.framework;

/**
 * Минимальный интерфейс итератора
 * @param <T> элемент для перебора
 */
public interface Iterator<T> {
    void first();
    void next();
    boolean isDone();
    T currentItem();
}