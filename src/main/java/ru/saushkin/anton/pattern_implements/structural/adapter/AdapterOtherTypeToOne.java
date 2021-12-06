package ru.saushkin.anton.pattern_implements.structural.adapter;

public class AdapterOtherTypeToOne implements OneTypeInterface{

    // Используем композицию адаптируемого интерфейса
    OtherTypeInterface otherTypeInterface = new OtherTypeInterfaceImpl();

    @Override
    public String getString() {
        // Тут может быть какая-либо адаптирующая логика
        return otherTypeInterface.getStringOtherwise();
    }
}
