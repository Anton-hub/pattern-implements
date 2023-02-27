package ru.saushkin.anton.pattern_implements.behavioural.template_method.impl;

import ru.saushkin.anton.pattern_implements.behavioural.template_method.framework.Abstraction;

public class Concrete2 extends Abstraction {
    @Override
    public String overriddenMethod1() {
        return "Реализиация примитивных операций";
    }

    @Override
    public String overriddenMethod2() {
        return "во 2 реализации класса Abstraction";
    }
}