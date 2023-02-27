package ru.saushkin.anton.pattern_implements.behavioural.memento;

import ru.saushkin.anton.pattern_implements.behavioural.memento.inner.Memento;
import ru.saushkin.anton.pattern_implements.behavioural.memento.inner.OriginatorImpl;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Originator originator = new OriginatorImpl();
        Stack<Memento> mementoStack = new Stack<>();
        originator.changeState("Hello World!");
        // можно сохранить состояние origin в отдельный объект, при это у нас нет доступа к этому состоянию из этого контекста
        mementoStack.push(originator.saveState());
        originator.changeState("Any else string");
        mementoStack.push(originator.saveState());

        for (Memento memento : mementoStack) {
            // доступен только публичный интерфейс memento
            System.out.println(String.format("Копия состояния Origin от %s", memento.getInstanceTime()));
        }

        originator.changeState("empty");
        originator.print();
        // передав memento в originator можем востановить старое состояние
        originator.restoreState(mementoStack.pop());
        originator.print();
        originator.restoreState(mementoStack.pop());
        originator.print();
    }
}
