package ru.saushkin.anton.pattern_implements.behavioural.state;

import ru.saushkin.anton.pattern_implements.behavioural.state.protect.Context;
import ru.saushkin.anton.pattern_implements.behavioural.state.protect.OffState;

public class Test {
    public static void main(String[] args) {
        // Контекст инициализируется с начальным состоянием
        Context context = new ContextImpl(new OffState());
        // во время вызова метода просиходит переход в другое состояние
        context.doAction();
        // поэтому при повторном вызове doAction отработает с другой реализацией {@link State#doAction}
        context.doAction();
        // и снова с другой
        context.doAction();
    }
}