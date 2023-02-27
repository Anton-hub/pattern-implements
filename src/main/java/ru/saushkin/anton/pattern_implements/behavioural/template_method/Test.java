package ru.saushkin.anton.pattern_implements.behavioural.template_method;

import ru.saushkin.anton.pattern_implements.behavioural.template_method.framework.Abstraction;
import ru.saushkin.anton.pattern_implements.behavioural.template_method.impl.Concrete1;
import ru.saushkin.anton.pattern_implements.behavioural.template_method.impl.Concrete2;

public class Test {
    public static void main(String[] args) {
        Abstraction templateMethodExample1 = new Concrete1();
        Abstraction templateMethodExample2 = new Concrete2();

        // вызываем шоблонный метод в разных реализациях
        templateMethodExample1.templateMethod();
        templateMethodExample2.templateMethod();
    }
}