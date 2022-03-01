package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен 1: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен 2: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен 3: " + prices.length);
        String[] names = new String[4];
        names[0] = "Гриша";
        names[1] = "Миша";
        names[2] = "Саша";
        names[3] = "Флера";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
