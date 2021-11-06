package ru.saushkin.anton.pattern_implements.creational.prototype;

public class Test {
    public static void main(String[] args) {
        //Создание объекта
        Product1 product1 = new Product1();
        product1.setProperty("Base Property");
        product1.setAddProperty("Add Property");

        //Клонировние объекта
        Product1 product1_2 = (Product1) product1.clone();

        System.out.println(product1);
        System.out.println(product1_2);
        System.out.println(product1 == product1_2);
        System.out.println(product1.equals(product1_2));
    }
}
