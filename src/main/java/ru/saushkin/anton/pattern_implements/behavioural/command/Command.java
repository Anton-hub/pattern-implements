package ru.saushkin.anton.pattern_implements.behavioural.command;

public interface Command {
    /**
     * Инскапсулирует команду в объект
     * @param string аргумент для выполнения команды
     */
    void execute(String string);
}
