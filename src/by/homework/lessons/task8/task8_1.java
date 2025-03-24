package by.homework.lessons.task8;

public class task8_1 {
//Задание 1.1.
//Напишите метод, который будет возвращать String и принимать в качестве 1-ого параметра и 2-ого параметра объекты типа String.
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        String str3 = concatenateStrings("Задание", " 1");
        System.out.println(str3);
    }
}

