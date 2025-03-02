package by.homework.lessons.task5;

import java.util.Scanner;

public class task5_3 {
    //Задание 3*.
// Ввести число с консоли, которое не заканчивается на 0.
// Вывести число в обратном порядке. Использовать оператор %. (цикл while,наподобие задачи, которую разбирали в конце занятия)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое не заканчивается на 0");
        int number = in.nextInt();
        // Проверка, чтобы введённое число не заканчивалось на 0
        if (number % 10 == 0) {
            System.out.println("Введенное число заканчивается на 0!");
            return;
        }
            int reversedNumber = 0;
            while (number > 0) {
                //Получаем последнюю цифру числа
                int lastNum = number % 10;
                // Добавляем её к новому перевернутому числу.
                reversedNumber = reversedNumber * 10 + lastNum;
                number /= 10;
                System.out.println("Число в обратном порядке:" + reversedNumber);
            }
        }
    }
