package ru.saushkin.anton.pattern_implements.creational.prototype;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Product1 extends AbstractProduct{

    private String addProperty;

    public Product1(Product1 product) {
        super(product);
        if (product != null) {
            this.addProperty = product.getAddProperty();
        }
    }

    @Override
    public AbstractProduct clone() {
        return new Product1(this);
    }
}
