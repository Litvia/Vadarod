package by.homework.lessons.task6;
public class task6_4 {
//Задание 4*.
//Создать массив (вручную). Отсортировать элементы массива в порядке возрастания. Вывести полученный массив.
//Выполнить с помощью цикла for
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};

        // Сортируем массив в порядке возрастания
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Меняем местами элементы
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    // Выводим отсортированный массив
                    System.out.print("Отсортированный массив: ");
                    for (int value : nums) {
                       System.out.print(value + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}