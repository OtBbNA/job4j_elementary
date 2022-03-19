package ru.job4j.inheritance;

public class Eye extends Surgeon {

    private String view;

    public Eye(String name, String surname, String education, String birthday, String position, String type, String view) {
        super(name, surname, education, birthday, position, type);
        this.view = view;
    }
}
