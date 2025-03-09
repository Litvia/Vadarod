package by.homework.lessons.task6;

public class task6_3 {
//Задание 3*.
//Создать массив вручную. Заменить максимальный и минимальный элемент массива.
//Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.
    public static void main(String[] args) {
        int[] nums = new int [20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
            System.out.println("Элемент [" + i + "]" + " равен " + nums[i]);
        }
        // Инициализация переменных для поиска минимума и максимума
        int min = 0;
        int max = 0;

        // Поиск минимального и максимального элементов
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[min]) {
                min = i;
            }
            if (nums[i] > nums[max]) {
                max = i;
            }
        }

        // Замена минимального и максимального элементов
        nums[min] = -1000;
        nums[max] = 1000;

        // Вывод измененного массива
        System.out.println("Измененный массив:");
        for (int value : nums) {
            System.out.print(value + " ");
        }
    }
}

