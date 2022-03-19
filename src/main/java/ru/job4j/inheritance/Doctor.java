package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String position;

    public Doctor(String name, String surname, String education, String birthday, String position) {
        super(name, surname, education, birthday);
        this.position = position;
    }
}
