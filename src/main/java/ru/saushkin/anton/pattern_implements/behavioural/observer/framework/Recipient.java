package ru.saushkin.anton.pattern_implements.behavioural.observer.framework;

/**
 * Интерейс получателя
 */
public interface Recipient {

    /**
     * Метод для получения уведомлений от наблюдателя
     * @param news уведомление
     */
    void update (String news);
}