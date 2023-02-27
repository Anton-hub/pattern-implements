package ru.saushkin.anton.pattern_implements.behavioural.visitor;

import ru.saushkin.anton.pattern_implements.behavioural.visitor.framework.DynamicAcceptService;
import ru.saushkin.anton.pattern_implements.behavioural.visitor.framework.Visitor;
import ru.saushkin.anton.pattern_implements.behavioural.visitor.impl.Service1;
import ru.saushkin.anton.pattern_implements.behavioural.visitor.impl.Service2;
import ru.saushkin.anton.pattern_implements.behavioural.visitor.impl.VisitorImpl;

public class Test {
    public static void main(String[] args) {
        DynamicAcceptService service1 = new Service1();
        DynamicAcceptService service2 = new Service2();
        Visitor visitor = new VisitorImpl();

        // вызываем accept с реализацией в поситителе
        service1.accept(visitor);
        service2.accept(visitor);

        // можем динамически определить другую реализацию accept без изменений в Service1
        service1.accept(new Visitor() {
            @Override
            public void visitService1(Service1 service) {
                System.out.println("Любая другая реализация");
            }

            @Override
            public void visitService2(Service2 service) {
                throw new UnsupportedOperationException();
            }
        });
    }
}