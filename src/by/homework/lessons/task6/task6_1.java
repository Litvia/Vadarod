package by.homework.lessons.task6;

public class task6_1 {
//Задание 1.
//Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
//Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each.
    public static void main(String[] args) {
        int[] nums = new int[10]; //массив состоит из 10 элементов
        // i инкрементируется пока i < длины массива, чтобы узнать длину массива (т.е кол-во элементов) используем свойство length.
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 3;
            System.out.println("Элемент [" + i + "]" + " равен " + nums[i]);
        }
        System.out.println("--------------------------");
        // Заменяем элементы с нечетными индексами на 0.
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                nums[i] = 0;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Элемент [" + i + "]" + " равен " + nums[i]);
        }
    }
}
