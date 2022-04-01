package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airbus = new Airplane();
        Vehicle boeing = new Airplane();
        Vehicle sapsan = new Train();
        Vehicle electricTrain = new Train();
        Vehicle autobus = new Autobus();
        Vehicle twoMinibus = new Autobus();
        Vehicle[] vehicle = new Vehicle[]{airbus, boeing, sapsan, electricTrain, autobus, twoMinibus};
        for (Vehicle i : vehicle) {
            i.move();
            i.capacity();
        }
    }
}
