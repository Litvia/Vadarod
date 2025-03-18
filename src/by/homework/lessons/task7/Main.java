package by.homework.lessons.task7;

public class Main {
    public static void main(String[] args) {

// Создание 1 студента с использованием конструктора с параметрами
        Student student = new Student(0, "Анастасия", "Литвиненко", "Информатика", 1, "10777", 4);

// Вызов метода info для отображения информации о студентах
        student.info();
        System.out.println("------------------------------"); // строка для разделения

// Изменение группы студента
        student.changeGroup("10887");

// Получаем текущую группу студента, а затем ее выводим в консоль
        String currentGroup = student.getCurrentGroup();
        System.out.println("Обновленная группа: " + currentGroup);

// Изменение оценки и группы студента одновременно
        student.updateMarkAndGroup(5, "10997");
        System.out.println("------------------------------"); // строка для разделения

// Создание массива из пяти студентов
        Student [] students = new Student[5];
        students[0] = new Student(1, "Иван", "Жуков", "Информатика", 2, " 10991", 5);
        students[1] = new Student(2, "Петр", "Кулик", "Информатика", 1, " 10991", 2);
        students[2] = new Student(3, "Мария", "Иванова", "Информатика", 3, " 10991", 4);
        students[3] = new Student(4, "Александр", "Петров", "Информатика", 4, " 10991", 3);
        students[4] = new Student(5, "Елена", "Сидорова", "Информатика", 5, " 10991", 1);


// Получение студентов с оценкой выше 4
        Student[] goodStudents = students[0].getStudents(students, 4);
        System.out.println("Студенты с оценкой выше 4:");
        for (Student Students: goodStudents) {
            student.info();
        }


        System.out.println("---------------");
        students[0].info(); // Вывод информации о первом студенте
        students[0].changeGroup("10991-02/25"); // Изменение группы первого студента
        System.out.println("Новая группа первого студента: " + students[0].getCurrentGroup());
        students[0].updateMarkAndGroup(5, "Best students 10991-02/25"); // Изменение оценки и группы первого студента
        students[0].info();
    }
}




