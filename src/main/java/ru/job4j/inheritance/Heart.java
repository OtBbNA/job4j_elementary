package ru.job4j.inheritance;

public class Heart extends Surgeon {

    private String view;

    public Heart(String name, String surname, String education, String birthday, String position, String type, String view) {
        super(name, surname, education, birthday, position, type);
        this.view = view;
    }
}
