package by.homework.lessons.lesson3;

import java.util.Scanner;

public class task3 {
//    3. Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления. Написать программу, которая будет выводит разный текст, в зависимости от значения result.
//    В случае result=3, вывести: "Результат деления равен 3"
//    В случае result=5, вывести: "Результат деления равен 5"
//    В других случаях вывести: "Результат деления равен дробному числу".
//    При этом в последнем случае вывести точный результат деления (использовать приведение типов)
//    Для выполнения задания использовать оператор switch- case.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();
        double result = 15/x;
//Если ввожу в значение переменной х дробное число (2,5), то получаю: Результат деления равен дробному числу:6.0
//А если ввожу 0, то получаю: Результат деления равен дробному числу:Infinity. Ерунда какая-то.
        switch ( (int) result){
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу:" + result);
                break;
        }
    }
}

