package ru.saushkin.anton.pattern_implements.behavioural.command;

public class LowerCaseCommand implements Command {

    private final Receiver receiver;

    public LowerCaseCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String string) {
        receiver.print(string.toLowerCase());
    }
}
