package ru.saushkin.anton.pattern_implements.behavioural.mediator;

public class Service1 {

    // связан с Service2 через посредника
    private final Mediator mediator;

    public Service1(Mediator mediator) {
        this.mediator = mediator;
    }

    public void actionWithService2() {
        doAnything();
        mediator.doAnythingInService2();
    }

    public void doAnything() {
        System.out.println("Service1 do anything");
    }

}
