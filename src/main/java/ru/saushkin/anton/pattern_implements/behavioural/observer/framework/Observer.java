package ru.saushkin.anton.pattern_implements.behavioural.observer.framework;

/**
 * Интерфейс наблюдателя
 */
public interface Observer {
    /**
     * Подключение получателя
     * @param recipient получатель
     */
    void registerObserver(Recipient recipient);

    /**
     * Удаление получателя
     * @param recipient получатель
     */
    void removeObserver(Recipient recipient);

    /**
     * Уведомление наблюдателя от объекта, объект может передать себя, для того чтобы наблюдатель мог получить доп. инфу.
     * @param subject ссылка на объект, позволяющая получить доп. инфу о событии
     */
    void notifyObserver(Subject subject);
}