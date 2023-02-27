package ru.saushkin.anton.pattern_implements.behavioural.chain_of_responsibility;

public class Test {
    public static void main(String[] args) {
        String stringWithSpace = "space space";
        String stringWithA = "A";
        String defaultString = "def";

        Handler chains = new SpaceDetector();
        chains.link(new AWordDetector());

        System.out.println("Is string has space - " + chains.handle(stringWithSpace));
        System.out.println("Is string has A - " + chains.handle(stringWithA));
        System.out.println("Is string has A or Space - " + chains.handle(defaultString));
    }
}
