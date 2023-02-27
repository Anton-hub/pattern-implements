package ru.saushkin.anton.pattern_implements.behavioural.visitor.impl;

import ru.saushkin.anton.pattern_implements.behavioural.visitor.framework.Visitor;

public class VisitorImpl implements Visitor {
    @Override
    public void visitService1(Service1 service) {
        System.out.println(service.getClass().getSimpleName() + " использовал VisitorImpl для реализации accept");
    }

    @Override
    public void visitService2(Service2 service) {
        System.out.println(service.getClass().getSimpleName() + " использовал VisitorImpl для реализации accept");
    }
}