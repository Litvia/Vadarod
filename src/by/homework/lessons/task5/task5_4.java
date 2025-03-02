package by.homework.lessons.task5;

import java.util.Scanner;

public class task5_4 {
//Задание 4*.
//Ввести число с консоли, которое не заканчивается на 0.
//Вывести чётные и нечётные числа через while and if. Использовать оператор %.
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число, которое не заканчивается на 0");
            int number = in.nextInt();
            // Проверка, что число не оканчивается на 0
            if (number % 10 == 0) {
                System.out.println("Введенное число не должно заканчиваться на 0.");
                return;
            }
            // Перебираем числа от введенного до 1 включительно
            System.out.println("Четные и нечетные числа:");
            while (number >= 1) {
                // Если число делится на 2 без остатка — четное
                if (number % 2 == 0) {
                    System.out.println(number + " — четное");
                } else { // Иначе — нечетное
                    System.out.println(number + " — нечетное");
                }
                // Уменьшаем число на единицу для продолжения цикла
                number--;
            }
        }
    }
