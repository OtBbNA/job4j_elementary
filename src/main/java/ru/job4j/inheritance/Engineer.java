package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String position;

    public Engineer(String name, String surname, String education, String birthday, String position) {
        super(name, surname, education, birthday);
        this.position = position;
    }
}
