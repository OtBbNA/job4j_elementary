package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            nik *= 2;
            ivan *= 3;
            month++;
            System.out.println(nik + " " + ivan);
        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println(Fitness.calc(90,90));
    }
}

