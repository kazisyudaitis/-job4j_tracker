package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.print("Поезд передвигается по рельсам: ");
    }

    @Override
    public void loadCapacity() {
        System.out.println("Грузоподьемность поезда, больше чем у самолета.");
    }
}
