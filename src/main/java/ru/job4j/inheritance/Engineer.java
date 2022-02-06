package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String specifications;

    public Engineer(String specifications) {
        super();
        this.specifications = specifications;
    }

    public Engineer() {
    }

    public Scheme schem(String project) {
        Scheme one = new Scheme();
        return one;
    }
}
