package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " moves through the air");
    }

    @Override
    public void capacity() {
        System.out.println(" and carrying 500 passengers.");
    }
}
