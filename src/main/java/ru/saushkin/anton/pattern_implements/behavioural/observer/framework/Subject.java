package ru.saushkin.anton.pattern_implements.behavioural.observer.framework;

/**
 * Интерфейс для объекта генерирующего события
 */
public interface Subject {

    /**
     * Метод для подключения наблюдателя
     * @param observer наблюдатель
     */
    void attach(Observer observer);

    /**
     * Метод для отключения наблюдателя
     */
    void detach();

    /**
     * Метод через который наблюдатель может запросить доп. инфу
     * @return доп. инфа
     */
    String getState();
}