package ru.saushkin.anton.pattern_implements.behavioural.interpreter;

import ru.saushkin.anton.pattern_implements.behavioural.interpreter.framework.Context;
import ru.saushkin.anton.pattern_implements.behavioural.interpreter.framework.Expression;
import ru.saushkin.anton.pattern_implements.behavioural.interpreter.util.Evaluator;

import java.text.ParseException;

public class Test {
    public static void main(String[] args) {
        try {
            Expression expression = Evaluator.evaluate("1100-990-23-23-4-10");
            System.out.println(expression.interpret(new Context(){}));
        } catch (ParseException e) {
            System.err.println(e.getMessage() + " indexOf(" + e.getErrorOffset() + ")");
        }
    }
}