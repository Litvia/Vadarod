package by.homework.lessons.task4;

import java.util.Scanner;

public class task4_1 {
//    Домашнее задание №4
//    Задача 1. На вход даны 3 числа. Вывести в консоль только четные числа
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//ввод чисел через консоль
        System.out.print("Введите число r: ");
        int r = scanner.nextInt();

        System.out.print("Введите число s: ");
        int s = scanner.nextInt();

        System.out.print("Введите число t: ");
        int t = scanner.nextInt();
//проверка и вывод четных чисел
//оператор % возвращает остаток от деления (x % y). Т е если остаток от деления == 0, то число четное.
        if (r % 2 == 0) {
            System.out.println(r + " четное число");
        }
        if (s % 2 == 0) {
            System.out.println(s + " четное число");
        }
        if (t % 2 == 0) {
            System.out.println(t + " четное число");
        }
        if (r % 2 != 0 && s % 2 != 0 && t % 2 != 0) {
            System.out.println("Нет четных чисел.");
        }
        if (r % 2 == 0 && s % 2 == 0 && t % 2 == 0) System.out.println("Все числа четные");
        }
    }