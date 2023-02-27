package ru.saushkin.anton.pattern_implements.behavioural.command;

public class UpperCaseOutput implements Command {

    private final Receiver receiver;

    public UpperCaseOutput(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String string) {
        receiver.print(string.toUpperCase());
    }
}
