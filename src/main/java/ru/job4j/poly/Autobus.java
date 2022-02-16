package ru.job4j.poly;

public class Autobus implements Vehicle {

    @Override
    public void move() {
        System.out.print("Автобус ездит по дорогам: ");
    }

    @Override
    public void loadCapacity() {
        System.out.println("Грузоподъемность автобуса 8 тонн.");
    }
}
