package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String operation;

    public Surgeon(String name, String surname, String education, String birthday, String experience, String operation) {
        super(name, surname, education, birthday, experience);
        this.operation = operation;
    }
}
