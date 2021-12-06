package ru.saushkin.anton.pattern_implements.structural.composite;

public class Node implements Component{

    private Component parent;

    private final String message;

    public Node() {
        this(null);
    }

    public Node(Component parent) {
        this.parent = parent;
        message = "default message";
    }

    public Node(String message, Component parent) {
        this.message = message;
        this.parent = parent;
    }

    @Override
    public void operation() {
        System.out.println(message);
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
