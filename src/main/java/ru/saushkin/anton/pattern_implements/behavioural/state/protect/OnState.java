package ru.saushkin.anton.pattern_implements.behavioural.state.protect;

import ru.saushkin.anton.pattern_implements.behavioural.state.State;

public class OnState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Выключаю...");
        context.changeStateOn(new OffState());
    }
}