package ru.saushkin.anton.pattern_implements.creational.prototype;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractProduct implements Cloneable {

    private String property;

    public AbstractProduct(AbstractProduct product) {
        if (product != null) {
            this.property = product.getProperty();
        }
    }

    public abstract AbstractProduct clone();
}
