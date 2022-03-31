package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
    }

    @Override
    public void passengers(int num) {
        num = 16;
    }

    @Override
    public double refuel(double gal) {
        double money = gal * 6.52;
        return money;
    }
}
