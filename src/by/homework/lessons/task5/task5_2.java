package by.homework.lessons.task5;

import java.util.Scanner;

public class task5_2 {
////Задание 2. Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа до другого.
//// (Используйте цикл while). Подсказка. До цикла объявите переменную int sum=0.
//// В самом цикле перезаписывайте в эту переменную сумму чисел.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное число a");
        System.out.println("Введите положительное число b");

        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0; //переменная для хранения суммы

        int min = Math.min(a, b); //Метод Math.min() – возвращает минимальное значение из двух аргументов. Аргумент может быть int, float, long, double.
        int max = Math.max(a, b); //Метод Math.max() – возвращает максимальное значение из двух аргументов. Аргумент может быть int, float, long, double.

        while (min <= max) {
            sum += min;
            min++;
            System.out.println("Сумма всех чисел от " + a + " до " + b + ": " + sum);
        }
    }
}
