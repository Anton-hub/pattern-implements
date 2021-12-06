package ru.saushkin.anton.pattern_implements.structural.composite;

public class Test {
    public static void main(String[] args) {
        // Общий интерфейс для компонуемых объектов
        Component base = new Composite(null);

        // Крайний узел не имеющий потомков
        Component node = new Node(base);

        // Композитный объект хранящий коллекцию потомков и ссылающийся на них
        Component compositeNode = new Composite(base);
        compositeNode.add(new Node("Any node", compositeNode));
        compositeNode.add(new Node("Any else node", compositeNode));

        base.add(node);
        base.add(compositeNode);

        base.operation();

        base.remove(node);
        base.operation();
    }
}
