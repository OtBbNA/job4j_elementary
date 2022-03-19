package ru.job4j.inheritance;

public class Python extends Programmer {

    private String level;

    public Python(String name, String surname, String education, String birthday, String position, String language, String level) {
        super(name, surname, education, birthday, position, language);
        this.level = level;
    }
}
