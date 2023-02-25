package ru.saushkin.anton.pattern_implements.behavioural.strategy;

import ru.saushkin.anton.pattern_implements.behavioural.strategy.framework.Context;
import ru.saushkin.anton.pattern_implements.behavioural.strategy.impl.ContextImpl;
import ru.saushkin.anton.pattern_implements.behavioural.strategy.impl.StrategyA;
import ru.saushkin.anton.pattern_implements.behavioural.strategy.impl.StrategyB;

public class Test {
    public static void main(String[] args) {
        // инициализация контекста с начальной стратегией
        Context context = new ContextImpl(new StrategyA());

        // doAction работает на установленной стратегии A
        System.out.println(context.doAction());
        context.changeStrategy(new StrategyB());
        // другой результат doAction при смене на стратегию B
        System.out.println(context.doAction());
    }
}