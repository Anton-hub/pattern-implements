package ru.saushkin.anton.pattern_implements.behavioural.chain_of_responsibility;

import java.util.Optional;

/**
 * класс определяющий шаблон обработчика, который либо обрабатывает запрос,
 * либо делегирует его обработку следующему в цепочке обработчику
 */
public abstract class Handler {

    private Handler next;

    /**
     * метод обрабатывающий запрос по своему либо отправляющий запрос дальше по цепочке
     * @param data информация требующая обработки
     * @return результат обработки
     */
    public abstract boolean handle(String data);

    /**
     * обработка запроса следующим обработчиком
     * @param data информация требующая обработки
     * @return результат обработки
     */
    public boolean handleNext(String data) {
        return Optional.ofNullable(next)
                .map(next -> next.handle(data))
                .orElseGet(() -> {
                    System.out.println("Запрос дошел до конца цепочки");
                    return false;
                });
    }

    /**
     * метод привязывающий следующий обработчик
     * @param next следующий обработчик
     * @return для удобства возвращает следующий обработчик у которого сразу можно вызвать его метод link
     */
    public Handler link(Handler next) {
        this.next = next;
        return next;
    }
}
