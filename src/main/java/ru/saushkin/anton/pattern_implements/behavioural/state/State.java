package ru.saushkin.anton.pattern_implements.behavioural.state;

import ru.saushkin.anton.pattern_implements.behavioural.state.protect.Context;

/**
 * Интерфейс для объектов состояния инкапсулирующий поведение для каждого состояния
 */
public interface State {
    /**
     * Методов может быть несколько, и каждый будет работать с учетом своего состояния
     * @param context может передаваться контекст из которго вызывается метод, например для смены состояния в контексте
     *                после выполнения какого-то действия
     */
    void doAction(Context context);
}