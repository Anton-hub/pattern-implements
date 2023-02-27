package ru.saushkin.anton.pattern_implements.behavioural.mediator;

public class Test {
    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();
        Service1 service1 = new Service1(mediator);
        Service2 service2 = new Service2(mediator);
        // циклическая зависимость получилась в рамках примера, не является особенностью паттерна
        mediator.setService1(service1);
        mediator.setService2(service2);

        // совместное действие с другим сервисом осуществляется через посрдника
        service1.actionWithService2();
        service2.actionWithService1();
    }
}