package ru.saushkin.anton.pattern_implements.behavioural.strategy.framework;

/**
 * Интерфейс определяющий контекст в котором используется стратегия
 */
public interface Context {
    /**
     * Метод использующий стратегию
     * @return значение теоритически возвращаемое стратегией (само собой опционально)
     */
    String doAction();
    /* Контекст может иметь свою реализацию doAction если никакой стратегии не задано, это будет считаться
    * поведением по умолчанию */

    /**
     * Не является частью паттерна
     * @param strategy новая стратегия для смены в контексте
     */
    void changeStrategy(ActionStrategy strategy);
}
