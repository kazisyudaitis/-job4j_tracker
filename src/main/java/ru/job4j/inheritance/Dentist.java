package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String tooth;

    public Dentist(String name, String surname, String education, String birthday, String experience, String tooth) {
        super(name, surname, education, birthday, experience);
        this.tooth = tooth;
    }
}
