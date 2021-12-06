package ru.saushkin.anton.pattern_implements.structural.decorator;

public class AddingDecorator extends Decorator{

    private final Component component;
    private final String addingPhrase;

    public AddingDecorator(Component component) {
        this(component,"default adding");
    }

    public AddingDecorator(Component component, String addingPhrase) {
        this.component = component;
        this.addingPhrase = addingPhrase;
    }

    @Override
    public String constructComponent() {
        return component.constructComponent() + " " + addingPhrase;
    }
}
