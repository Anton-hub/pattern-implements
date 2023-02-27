package ru.saushkin.anton.pattern_implements.behavioural.observer.impl;

import ru.saushkin.anton.pattern_implements.behavioural.observer.framework.Observer;
import ru.saushkin.anton.pattern_implements.behavioural.observer.framework.Recipient;
import ru.saushkin.anton.pattern_implements.behavioural.observer.framework.Subject;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl implements Observer {

    List<Recipient> recipients = new ArrayList<>();

    @Override
    public void registerObserver(Recipient recipient) {
        if ( ! recipients.contains(recipient)) {
            recipients.add(recipient);
        }
    }

    @Override
    public void removeObserver(Recipient recipient) {
        recipients.remove(recipient);
    }

    @Override
    public void notifyObserver(Subject subject) {
        String news = subject.getState();
        notifyRecipients(subject.getClass().getSimpleName() + " сменил свой статус на '" + news + "'");
    }

    private void notifyRecipients(String news) {
        recipients.forEach(e -> e.update(news));
    }
}