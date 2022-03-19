package ru.job4j.inheritance;

public class Java extends Programmer {

    private String level;

    public Java(String name, String surname, String education, String birthday, String position, String language, String level) {
        super(name, surname, education, birthday, position, language);
        this.level = level;
    }
}
