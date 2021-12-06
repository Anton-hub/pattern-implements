package ru.saushkin.anton.pattern_implements.structural.decorator;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Decorator extends Decorator {

    private final Component component;
    private final Charset charset;

    public Base64Decorator(Component component) {
        this(component, StandardCharsets.UTF_8);
    }

    public Base64Decorator(Component component, Charset charset) {
        this.component = component;
        this.charset = charset;
    }

    @Override
    public String constructComponent() {
        return new String(Base64.getEncoder().encode(component.constructComponent().getBytes(charset)));
    }
}
