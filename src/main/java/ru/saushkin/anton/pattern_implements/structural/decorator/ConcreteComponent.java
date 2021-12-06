package ru.saushkin.anton.pattern_implements.structural.decorator;

public class ConcreteComponent implements Component {
    @Override
    public String constructComponent() {
        return "Concrete component";
    }
}
