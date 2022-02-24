package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDivi(double first, double second) {
        return diff(first, second)
                + divi(first, second);
    }

    public static double allOp(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + diff(first, second)
                + divi(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 1 метода равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 2 метода равен: " + diffAndDivi(10, 20));
        System.out.println("Результат расчета 3 метода равен: " + allOp(10, 20));
    }
}
