package ru.job4j.inheritance;

public class Anesthetist extends Dentist {

    private String view;

    public Anesthetist(String name, String surname, String education, String birthday, String position, String type, String view) {
        super(name, surname, education, birthday, position, type);
        this.view = view;
    }
}
