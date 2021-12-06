package ru.saushkin.anton.pattern_implements.structural.flyweight;

public interface Flyweight {
    /**
     * @param externalContext внешнее состояние, контекст в котором используется легковес
     */
    String getResult(String externalContext);
}
