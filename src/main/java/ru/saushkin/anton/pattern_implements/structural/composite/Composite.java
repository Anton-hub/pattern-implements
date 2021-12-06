package ru.saushkin.anton.pattern_implements.structural.composite;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Composite implements Component {

    private Component parent;
    private final List<Component> components = new ArrayList<>();

    public Composite(Component parent) {
        this.parent = parent;
    }

    @Override
    public void operation() {
        components.forEach(Component::operation);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }

    @Override
    public void setParent(Component parent) {
        this.parent = parent;
    }

    @Override
    public Component getParent() {
        return parent;
    }
}
