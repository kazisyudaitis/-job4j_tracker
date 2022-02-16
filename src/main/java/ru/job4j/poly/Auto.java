package ru.job4j.poly;

public class Auto {
    public static void main(String[] args) {
       Vehicle airplane = new Airplane();
       Vehicle train = new Train();
       Vehicle autobus = new Autobus();
       Vehicle[] vehicles = new Vehicle[] {autobus, airplane, train};
        for (Vehicle veh : vehicles) {
            veh.move();
            veh.loadCapacity();
        }
    }
}
