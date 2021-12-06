package ru.saushkin.anton.pattern_implements.structural.bridge.implementor;

import ru.saushkin.anton.pattern_implements.structural.bridge.baseconcepts.Implementor;

public interface Colour extends Implementor {
    String paint();
}
