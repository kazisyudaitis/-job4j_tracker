package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String application;

    public Programmer(String name, String surname, String education, String birthday, String specifications, String application) {
        super(name, surname, education, birthday, specifications);
        this.application = application;
    }
}
