package ru.job4j.poly;

public class Bus implements Transport {


    @Override
    public void drive() {
        System.out.println("Поездка в автобусе");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Количество пассажиров в автобусе " + number);
    }

    @Override
    public double refuel(double gasoline) {
        return gasoline * 10;
    }
}
