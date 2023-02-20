package ru.saushkin.anton.pattern_implements.behavioural.interpreter.framework;

/**
 * Общий интерфейс для всех выражений
 */
public interface Expression {
    int interpret(Context context);
}