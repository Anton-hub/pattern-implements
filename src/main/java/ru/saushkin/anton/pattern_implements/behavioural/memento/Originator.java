package ru.saushkin.anton.pattern_implements.behavioural.memento;

import ru.saushkin.anton.pattern_implements.behavioural.memento.inner.Memento;

public interface Originator {
    Memento saveState();
    void restoreState(Memento memento);
    void changeState(String string);
    void print();
}
