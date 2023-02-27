package ru.saushkin.anton.pattern_implements.behavioural.visitor.framework;

import ru.saushkin.anton.pattern_implements.behavioural.visitor.impl.Service1;
import ru.saushkin.anton.pattern_implements.behavioural.visitor.impl.Service2;

/**
 * Интерфейс посетителя в имплементациях которого можно определить
 * реализацию метода accept для потомков DynamicAcceptService
 */
public interface Visitor {
    /*
    * Визитер должен реализовать методы для всех классов в которых он используется
    */
    /**
     * Определяет метод который будет вызываться из Service1#accept
     * @param service класс использующий посетителя может передать в аргументах ссылку на себя, чтобы дать доступ
     *                поситителю к своему интерфейсу/состоянию
     */
    void visitService1(Service1 service);

    /**
     * аналогично visitService1
     */
    void visitService2(Service2 service);
}