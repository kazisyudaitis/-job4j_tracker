package ru.job4j.poly;

public class Airplane implements Vehicle {

    @Override
    public void move() {
        System.out.print("Самолет летает: ");
    }

    @Override
    public void loadCapacity() {
        System.out.println("Грузоподъемность самолета, больше чем у автобуса.");
    }
}
