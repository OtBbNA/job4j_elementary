package ru.job4j.checkstyle;

public class Broken {

    public final int sizeOfEmpty = 10;
    public static final String NEW_VALUE = "";

    private String surname;
    private String name;

    public Broken() {
    }

    void echo() {

    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c, int d, int e, int f, int g) {

    }
}