package ru.saushkin.anton.pattern_implements.structural.adapter;

public class Test {
    public static void main(String[] args) {
        OneTypeInterface adapterOtherTypeToOne = new AdapterOtherTypeToOne();
        // Вызываем OtherTypeInterface::getStringOtherwise адаптированный для getString в OneTypeInterface интерфейсе
        System.out.println(adapterOtherTypeToOne.getString());
    }
}
