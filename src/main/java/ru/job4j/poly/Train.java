package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " moves on rails");
    }

    @Override
    public void capacity() {
        System.out.println(" and carrying 600 passengers.");
    }
}
