package ru.saushkin.anton.pattern_implements.behavioural.mediator;


/**
 * Определеят интерфейс взаимодействия между сервисами не связанными друг с другом на прямую
 */
public interface Mediator {
    void doAnythingInService1();
    void doAnythingInService2();
}
