package ru.saushkin.anton.pattern_implements.behavioural.mediator;

public class Service2 {

    // связан с Service1 через посредника
    private final Mediator mediator;

    public Service2(Mediator mediator) {
        this.mediator = mediator;
    }

    public void actionWithService1() {
        doAnything();
        mediator.doAnythingInService1();
    }

    public void doAnything() {
        System.out.println("Service2 do anything");
    }

}
