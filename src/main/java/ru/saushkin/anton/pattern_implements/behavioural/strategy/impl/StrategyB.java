package ru.saushkin.anton.pattern_implements.behavioural.strategy.impl;

import ru.saushkin.anton.pattern_implements.behavioural.strategy.framework.ActionStrategy;

public class StrategyB implements ActionStrategy {
    @Override
    public String doActionAlgorithm() {
        return "Действие по алгоритму B";
    }
}