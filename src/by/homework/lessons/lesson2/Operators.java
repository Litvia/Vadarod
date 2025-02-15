package by.homework.lessons.lesson2;

import java.util.Arrays;

public class Operators {
    public static void main(String[] args) {
//ps
        int a = 5;
        int b = 6;

        int sum = a + 6;
        int substract = a - b;
        int multiply = a * b;
        int devide = a / b;

        int c = 62;
        double d = 62.45;
        double co = d % 10;

        System.out.println("результат деления " + co);
        //so
        a = a + 5;  //1 способ переобъявление значения переменной
        a += 5;       //2 способ сложение с присваеванием

        System.out.println("сложение с присваеванием" + a);

        a -= 3;
        b /= 2; //= записи b=b/2;
        b *= 2; //= записи b=b*2;

        System.out.println("************************************");

        int increment = 4;
        int decrement = 3;
        ++increment;
        increment++;
        System.out.println("операция инкремента " + increment);

        System.out.println("операция декремента " + decrement);

        int y = 45;
        int x = ++y;

        System.out.println("x: " + x + " " + "y: " + y);

        int z = 45;
        int w = y++;

        System.out.println("w: " + w + " " + "z: " + z);

    System.out.println("************************************");
    int f=5;
    int j=6;

    boolean equal = f == j;     //если f равна j, то вернется true. Если f не равна j, то вернется false
        System.out.println(equal);

    boolean notEqual = f != j;     //если f не равна j, то вернется true. Если f равна j, то вернется false
        System.out.println(notEqual);

    boolean greather = f>j;
        System.out.println(greather);
    boolean less = f<j;
        System.out.println(less);

        boolean greatherOrEqual = f>=j;
        boolean lessOrEqual = f<=j;

    System.out.println("************************************");
    boolean n = true;
    boolean m = false;
    boolean s = n | m;     //логическая операция ИЛИ вернет TRUE.Если хотя бы одно из значений равно TRUE, тогда запишется TRUE
    boolean b1 = n & m;    //логическая операция И вернет FALSE. Если оба значения равно TRUE, тогда запишется TRUE (все значения должны быть равны TRUE)
    boolean b2 = n ^ m;    //логическая операция исключающая ИЛИ вернет FALSE. Сравнивает оба значения и возвращает TRUE, если они различны, и FALSE, если они одинаковы.
    boolean b3 = n != m;   //логическая операция НЕ РАВНО вернет TRUE
        System.out.println("s:" + s + "; b1:" + b1 + "; b2: " + b2 + "; b3: " + b3);


        int a1 = 7;
        int a2 = 8;
        int a3 = a1 > a2 ? 10 : 15;  //если а1 больше а2, если это true, то тогда возвращаем 10: иначе мы записываем в переменную число 15
        System.out.println("a3 = " + a3);
    }
}
