package ru.saushkin.anton.pattern_implements.behavioural.mediator;

public class MediatorImpl implements Mediator {

    private Service1 service1;
    private Service2 service2;

    @Override
    public void doAnythingInService1() {
        service1.doAnything();
    }

    @Override
    public void doAnythingInService2() {
        service2.doAnything();
    }

    public Service1 getService1() {
        return service1;
    }

    public void setService1(Service1 service1) {
        this.service1 = service1;
    }

    public Service2 getService2() {
        return service2;
    }

    public void setService2(Service2 service2) {
        this.service2 = service2;
    }
}