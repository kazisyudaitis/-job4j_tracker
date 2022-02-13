package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches > 0 && matches <= 3) {
                if (count >= matches) {
                    count = count - matches;
                    System.out.println("На столе осталось: " + count + " спичек");
                } else {
                    System.out.println("Введенное количество не может быть больше остатка. Остаток равен: " + count);
                    turn = !turn;
                }
            } else if (matches < 0 || matches > 3) {
                System.out.println("Введенное число должно быть от 1 до 3");
                turn = !turn;
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
