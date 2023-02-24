package ru.saushkin.anton.pattern_implements.behavioural.observer;

import ru.saushkin.anton.pattern_implements.behavioural.observer.framework.Observer;
import ru.saushkin.anton.pattern_implements.behavioural.observer.framework.Recipient;
import ru.saushkin.anton.pattern_implements.behavioural.observer.impl.ObserverImpl;
import ru.saushkin.anton.pattern_implements.behavioural.observer.impl.Recipient1;
import ru.saushkin.anton.pattern_implements.behavioural.observer.impl.Recipient2;
import ru.saushkin.anton.pattern_implements.behavioural.observer.impl.SubjectImpl;

public class Test {
    public static void main(String[] args) {
        Recipient recipient1 = new Recipient1();
        Recipient recipient2 = new Recipient2();
        Observer observer = new ObserverImpl();
        // регистрация получателей в обсервер
        observer.registerObserver(recipient1);
        observer.registerObserver(recipient2);
        SubjectImpl subject = new SubjectImpl();
        // присоединение наблюдателя к объекту
        subject.attach(observer);

        subject.setState("new state");

        // удаление получателя из наблюдателя
        observer.removeObserver(recipient1);
        subject.setState("other new state");

        // отсоединение наблюдателя от объекта
        subject.detach();
        subject.setState("sneaky state");
    }
}