package ru.saushkin.anton.pattern_implements.behavioural.interpreter.impl;


import ru.saushkin.anton.pattern_implements.behavioural.interpreter.framework.Context;
import ru.saushkin.anton.pattern_implements.behavioural.interpreter.framework.TerminalExpression;

public class Digit implements TerminalExpression {

    private final int digit;

    public Digit(int digit) {
        this.digit = digit;
    }

    @Override
    public int interpret(Context context) {
        return digit;
    }

    @Override
    public String toString() {
        return String.valueOf(digit);
    }
}