package ru.saushkin.anton.pattern_implements.behavioural.interpreter.util;

import ru.saushkin.anton.pattern_implements.behavioural.interpreter.framework.Expression;
import ru.saushkin.anton.pattern_implements.behavioural.interpreter.impl.Digit;
import ru.saushkin.anton.pattern_implements.behavioural.interpreter.impl.Minus;
import ru.saushkin.anton.pattern_implements.behavioural.interpreter.impl.Plus;

import java.text.ParseException;
import java.util.*;

/**
 * Не является частью паттерна
 */
public class Evaluator {

    /**
     * Конвертирует строку в объект Expression
     * @param input входящая строка
     * @return собраный на основе input объект Expression
     * @throws ParseException ошибка при передаче невалидной строки
     */
    public static Expression evaluate(String input) throws ParseException {
        validate(input);
        Stack<Expression> stack = new Stack<>();
        for (String digit : reverse(input.split("[+-]"))) {
            stack.push(new Digit(Integer.parseInt(digit)));
        }
        for (String operator : trim(input.split("\\d+"))) {
            switch (operator) {
                case "+": stack.push(new Plus(stack.pop(), stack.pop())); break;
                case "-": stack.push(new Minus(stack.pop(), stack.pop())); break;
                default: throw new UnsupportedOperationException();
            }
        }
        return stack.pop();
    }

    /**
     * Не идеально но больмень работает
     */
    private static void validate(String input) throws ParseException {
        if (Objects.isNull(input) || input.isEmpty()) {
            throw new ParseException("Строка пустая", 0);
        }
        String[] validatedParts = trim(input.split("\\d+([+-]\\d+)*"));
        if (validatedParts.length > 0) {
            throw new ParseException(String.format("Ошибка парсинга, невалидный символ '%s'.",
                    validatedParts[0]), input.indexOf(validatedParts[0]));
        }
    }

    private static String[] reverse(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        return list.toArray(new String[]{});
    }

    private static String[] trim(String[] array) {
        if(array.length > 0 && array[0].isEmpty()) {
            return Arrays.copyOfRange(array, 1, array.length);
        } else {
            return array;
        }
    }
}