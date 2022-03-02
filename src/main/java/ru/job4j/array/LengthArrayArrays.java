package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {7, 2}, {4, 4, 8}, {9, 2, 9, 2}};
        System.out.println("Размер 1 вложенного массива равен: " + numbers[0].length);
        System.out.println("Размер 2 вложенного массива равен: " + numbers[1].length);
        System.out.println("Размер 3 вложенного массива равен: " + numbers[2].length);
        System.out.println("Размер 4 вложенного массива равен: " + numbers[3].length);
        }
}
