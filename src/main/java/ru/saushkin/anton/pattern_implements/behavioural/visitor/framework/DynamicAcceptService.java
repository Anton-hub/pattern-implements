package ru.saushkin.anton.pattern_implements.behavioural.visitor.framework;

/**
 * Интерфейс класса который использует посетителя в реализации метода accept
 */
public interface DynamicAcceptService {
    void accept(Visitor visitor);
}