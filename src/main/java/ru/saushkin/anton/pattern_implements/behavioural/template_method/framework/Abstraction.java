package ru.saushkin.anton.pattern_implements.behavioural.template_method.framework;

/**
 * Пример класса с шаблонным методом
 */
public abstract class Abstraction {

    /**
     * Шаблонный метод, определяемый в родительском классе, вызывающий переопределяемые, в дочерних классах, операции
     */
    public final void templateMethod() {
        System.out.println(overriddenMethod1() + " " + overriddenMethod2());
    }

    /**
     * Операция вызываемая в шаблонном методе
     * @return возвращаемое значение для примера
     */
    public abstract String overriddenMethod1();

    /**
     * Операция вызываемая в шаблонном методе
     * @return возвращаемое значение для примера
     */
    public abstract String overriddenMethod2();
}