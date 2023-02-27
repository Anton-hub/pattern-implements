package ru.saushkin.anton.pattern_implements.behavioural.visitor.impl;

import ru.saushkin.anton.pattern_implements.behavioural.visitor.framework.DynamicAcceptService;
import ru.saushkin.anton.pattern_implements.behavioural.visitor.framework.Visitor;

public class Service2 implements DynamicAcceptService {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitService2(this);
    }
}