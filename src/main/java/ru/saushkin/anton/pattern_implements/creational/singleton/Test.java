package ru.saushkin.anton.pattern_implements.creational.singleton;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Присваивание 2 переменным синглетон
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);

        //Параллельный вариант
        ExecutorService executorService = Executors.newCachedThreadPool();
        Callable<SynchronizedSingleton> task = () -> SynchronizedSingleton.getInstance();
        Future<SynchronizedSingleton> singletonFuture1 = executorService.submit(task);
        Future<SynchronizedSingleton> singletonFuture2 = executorService.submit(task);

        System.out.println(singletonFuture1.get() == singletonFuture2.get());
        executorService.shutdown();
    }
}
