package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String experience;

    public Doctor(String experience) {
        super();
        this.experience = experience;
    }

    public Doctor() {
    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diagnos = new Diagnosis();
        return diagnos;

    }
}
