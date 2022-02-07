package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String specifications;

    public Engineer(String name, String surname, String education, String birthday, String specifications) {
        super(name, surname, education, birthday);
        this.specifications = specifications;
    }

    public Scheme schem(String project) {
        Scheme one = new Scheme();
        return one;
    }
}
