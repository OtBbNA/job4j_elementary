package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String type;

    public Dentist(String name, String surname, String education, String birthday, String position, String type) {
        super(name, surname, education, birthday, position);
        this.type = type;
    }
}
