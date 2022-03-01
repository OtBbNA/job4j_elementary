package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            boolean buf = data[0];
            if (buf != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
