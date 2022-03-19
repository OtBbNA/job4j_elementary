package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String workTypes;

    public Builder(String name, String surname, String education, String birthday, String position, String workTypes) {
        super(name, surname, education, birthday, position);
        this.workTypes = workTypes;
    }
}

