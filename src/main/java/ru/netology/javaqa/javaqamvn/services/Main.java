package ru.netology.javaqa.javaqamvn.services;

public class Main {
    public static void main(String[] args) {
        freelanceService service = new freelanceService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        System.out.println("Колличество месяцев для отдыха: " + " Ожидаемый " + expected + "; Реальный " + actual);

        expected = 2;
        actual = service.calculate(100_000, 60_000, 150_000);
        System.out.println("Колличество месяцев для отдыха: " + " Ожидаемый " + expected + "; Реальный " + actual);
    }
}