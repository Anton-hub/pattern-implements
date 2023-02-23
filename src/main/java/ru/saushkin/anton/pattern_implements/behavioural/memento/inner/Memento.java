package ru.saushkin.anton.pattern_implements.behavioural.memento.inner;

import java.time.LocalDateTime;

/**
 * Интерфейс хранителя
 */
public abstract class Memento {

    private final LocalDateTime instanceTime;

    Memento() {
        this.instanceTime = LocalDateTime.now();
    }

    // приватный интерфес, который в идеале должен быть доступен только хозяину
    abstract void saveState();
    abstract void restoreState();

    // публичный интерфейс
    public LocalDateTime getInstanceTime() {
        return instanceTime;
    }
}
