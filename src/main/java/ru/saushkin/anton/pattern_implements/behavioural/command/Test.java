package ru.saushkin.anton.pattern_implements.behavioural.command;

public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command toLowerOutput = new LowerCaseCommand(receiver);
        Command toUpperOutput = new UpperCaseOutput(receiver);

        String exampleString = "DFffErRggG";

        commandExecutor(toLowerOutput, exampleString);
        commandExecutor(toUpperOutput, exampleString);
    }

    private static void commandExecutor(Command command, String string) {
        command.execute(string);
    }
}
