package ru.saushkin.anton.pattern_implements.structural.adapter;

public class OtherTypeInterfaceImpl implements OtherTypeInterface{
    @Override
    public String getStringOtherwise() {
        return "Returned string";
    }
}
