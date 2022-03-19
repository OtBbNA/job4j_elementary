package ru.job4j.inheritance;

public class Periodontist extends Dentist {

    private String view;

    public Periodontist(String name, String surname, String education, String birthday, String position, String type, String view) {
        super(name, surname, education, birthday, position, type);
        this.view = view;
    }
}

