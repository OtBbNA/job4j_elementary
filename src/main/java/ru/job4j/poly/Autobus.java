package ru.job4j.poly;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " moving on the highway");
    }

    @Override
    public void capacity() {
        System.out.println(" and carrying 36 passengers.");
    }
}
