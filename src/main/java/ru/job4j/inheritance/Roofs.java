package ru.job4j.inheritance;

public class Roofs extends Builder {

    private String type;

    public Roofs(String name, String surname, String education, String birthday, String position, String workTypes, String type) {
        super(name, surname, education, birthday, position, workTypes);
        this.type = type;
    }
}
