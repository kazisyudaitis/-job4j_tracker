package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String build;

    public Builder(String name, String surname, String education, String birthday, String specifications, String build) {
        super(name, surname, education, birthday, specifications);
        this.build = build;
    }
}
