package by.homework.lessons.task8;

public class task8_2 {
//Задание 2.1.
//В этом методе необходимо выполнить следующую логику. Если строка в 1-ом параметре заканчивается строкой из второго параметра,
//то необходимо вырезать из строки 1-ого параметра значение строки не включающей строку из второго параметра.
//Иначе вернуть строку из 1-ого параметра приведённую к верхнему регистру.
// Пример: Есть 1-ая строка «Я люблю java» и 2-ая строка «java». Так как первая строка оканчивается такой же строкой что и 2-ая строка (java),
//то метод должен вернуть «Я люблю» иначе метод должен вернуть «Я ЛЮБЛЮ JAVA».
//В этом методе нужно использовать методы для работы со строками: endWith(), indexOf(), substring(), toUpperCase();

    public static void main(String[] args) {
        System.out.println(processString("Я люблю java", "java"));
        System.out.println(processString("Я люблю Java", "java"));
    }

    public static String processString(String str1, String str2) {
        // Проверка, заканчивается ли строка str1 на str2
        if (str1.toLowerCase().endsWith(str2.toLowerCase())) {
            // Вырезаем из строки str1 значение, не включающее str2
            int index = str1.toLowerCase().indexOf(str2.toLowerCase());
            return str1.substring(0, index).trim();
        } else {
            // Возвращаем строку str1 в верхнем регистре
            return str1.toUpperCase();
        }
    }
}
