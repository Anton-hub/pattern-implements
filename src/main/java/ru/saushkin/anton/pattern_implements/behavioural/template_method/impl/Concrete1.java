package ru.saushkin.anton.pattern_implements.behavioural.template_method.impl;

import ru.saushkin.anton.pattern_implements.behavioural.template_method.framework.Abstraction;

public class Concrete1 extends Abstraction {
    @Override
    public String overriddenMethod1() {
        return "Реализиация примитивных операций";
    }

    @Override
    public String overriddenMethod2() {
        return "в 1 реализации класса Abstraction";
    }
}