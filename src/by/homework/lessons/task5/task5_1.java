package by.homework.lessons.task5;

public class task5_1 {
//Задание 1.
// Вывести все числа кратные 7 или 3 в диапазоне от 1 до 100. (можно использовать цикл for)

// for(<начальная точка>; <условие выхода>; <операторы счетчика>)
//принцип цикла — for — следующий: код, который находится в теле цикла, будет выполнен столько раз, сколько преобразований
//выполнит оператор счетчика до того, как будет достигнуто условие выхода из цикла

    public static void main(String[] args) {
// используя цикл for проходим по числам от 1 до 100.

        int i;
        for (i = 1; i <= 100; i++) {

//проверяем, делится ли текущее число i на 3 или на 7. Если хотя бы одно из условий выполняется, мы выводим это число.
            if (i % 3 == 0 || i % 7 == 0)
                System.out.println(i);
        }
    }
}
