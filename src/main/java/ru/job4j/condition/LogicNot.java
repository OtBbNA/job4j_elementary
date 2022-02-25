package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && notPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        int i = 6;
        System.out.println(isEven(i));
        System.out.println(isPositive(i));
        System.out.println(notEven(i));
        System.out.println(notPositive(i));
        System.out.println(notEvenAndPositive(i));
        System.out.println(evenOrNotPositive(i));
    }
}
