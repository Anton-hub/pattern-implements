package ru.saushkin.anton.pattern_implements.behavioural.strategy.impl;

import ru.saushkin.anton.pattern_implements.behavioural.strategy.framework.ActionStrategy;
import ru.saushkin.anton.pattern_implements.behavioural.strategy.framework.Context;

import java.util.Objects;

public class ContextImpl implements Context {

    private ActionStrategy strategy;

    public ContextImpl(ActionStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String doAction() {
        return strategy.doActionAlgorithm();
    }

    @Override
    public void changeStrategy(ActionStrategy strategy) {
        if (Objects.nonNull(strategy)) {
            this.strategy = strategy;
        }
    }
}
