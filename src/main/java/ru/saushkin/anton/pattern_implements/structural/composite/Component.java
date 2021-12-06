package ru.saushkin.anton.pattern_implements.structural.composite;

public interface Component {

    void operation();
    default void add(Component component) {}
    default void remove(Component component) {}
    default Component getChild(int index) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    // Опционально
    void setParent(Component parent);
    Component getParent();
}
