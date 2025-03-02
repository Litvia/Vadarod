package by.homework.lessons.task4;
import java.util.Scanner;

public class task4_2 {
//    Домашнее задание №4
//Задача 2. На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5 (используйте оператор % для проверки деления без остатка)
//ввод чисел через консоль
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ввод чисел через консоль
        System.out.print("Введите число r: ");
        int r = scanner.nextInt();

        System.out.print("Введите число s: ");
        int s = scanner.nextInt();

        System.out.print("Введите число t: ");
        int t = scanner.nextInt();
//Не совсем поняла задание. Если число должно делиться и на 2, и на 5, то думаю, что подойдет такой вариант
        if (r % 2 == 0 & r % 5 == 0) System.out.println(r + " делится и на 2, и на 5");
        else {
            System.out.println("число " + r + " не подходит под условие");
        }
        if (s % 2 == 0 & s % 5 == 0) System.out.println(s + " делится и на 2, и на 5");
        else {
            System.out.println("число " + s + " не подходит под условие");
        }
        if (t % 2 == 0 & t % 5 == 0) System.out.println(t + " делится и на 2, и на 5");
        else {
            System.out.println("число " + t + " не подходит под условие");
        }
    }
}