package ru.saushkin.anton.pattern_implements.behavioural.interpreter.impl;


import ru.saushkin.anton.pattern_implements.behavioural.interpreter.framework.Context;
import ru.saushkin.anton.pattern_implements.behavioural.interpreter.framework.Expression;
import ru.saushkin.anton.pattern_implements.behavioural.interpreter.framework.NonTerminalExpression;

public class Plus implements NonTerminalExpression {

    private final Expression leftExpression;
    private final Expression rightExpression;

    public Plus(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }

    @Override
    public String toString() {
        return leftExpression.toString() + '+' + rightExpression.toString();
    }
}