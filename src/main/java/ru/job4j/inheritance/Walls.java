package ru.job4j.inheritance;

public class Walls extends Builder {

    private String type;

    public Walls(String name, String surname, String education, String birthday, String position, String workTypes, String type) {
        super(name, surname, education, birthday, position, workTypes);
        this.type = type;
    }
}
