package ru.saushkin.anton.pattern_implements.behavioural.state.protect;

import ru.saushkin.anton.pattern_implements.behavioural.state.State;

/**
 * Интерфейс определяющий контекст в котором используются метод(ы) разных состояний
 */
public abstract class Context {
    /**
     * Метод в котором полиморфно вызывается {@link State#doAction(Context)}
     */
    public abstract void doAction();

    /**
     * Метод для смены состояния, сделан закрытым для вызова извне, доступен для вызова из объектов
     * реализующих {@link State} в этом пакете
     * @param state новое состояние
     */
    protected abstract void changeStateOn(State state);
}