package ru.saushkin.anton.pattern_implements.behavioural.state;

import ru.saushkin.anton.pattern_implements.behavioural.state.protect.Context;

public class ContextImpl extends Context {

    private State state;

    public ContextImpl(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        state.doAction(this);
    }

    @Override
    protected void changeStateOn(State state) {
        this.state = state;
    }
}