package ru.saushkin.anton.pattern_implements.behavioural.memento.inner;

import ru.saushkin.anton.pattern_implements.behavioural.memento.Originator;

public class OriginatorImpl implements Originator {

    private String string;
    private boolean changeFlag;

    @Override
    public Memento saveState() {
        Memento memento = new MementoImpl();
        memento.saveState();
        return memento;
    }

    @Override
    public void restoreState(Memento memento) {
        memento.restoreState();
    }

    @Override
    public void changeState(String string) {
        this.string = string;
        changeFlag = true;
    }

    @Override
    public void print() {
        System.out.println(String.format("OriginImpl: %s", string));
    }

    private class MementoImpl extends Memento {

        private String string;
        private boolean flag;

        @Override
        void saveState() {
            string = OriginatorImpl.this.string;
            flag = OriginatorImpl.this.changeFlag;
        }

        @Override
        void restoreState() {
            OriginatorImpl.this.string = string;
            OriginatorImpl.this.changeFlag = flag;
        }
    }
}
