package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int k = money - price;
        for (int i = 0; k != 0; i++) {
            while (k > 0) {
            k = k - coins[i];
            rsl[size++] = coins[i];
                if (k < coins[i]) {
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}