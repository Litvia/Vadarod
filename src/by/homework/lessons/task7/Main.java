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
        student.changeMarkAndGroup(5, "10997");
        System.out.println("------------------------------"); // строка для разделения

 //Создание массива из пяти студентов
        Student [] students = new Student[5];
        students[0] = new Student(1, "Иван", "Жуков", "Информатика", 2, " 10991", 4);
        students[1] = new Student(2, "Петр", "Кулик", "Информатика", 1, " 10991", 5);
        students[2] = new Student(3, "Мария", "Иванова", "Информатика", 3, " 10991", 4);
        students[3] = new Student(4, "Александр", "Петров", "Информатика", 4, " 10991", 5);
        students[4] = new Student(5, "Елена", "Сидорова", "Информатика", 5, " 10991", 4);
        // Вывод информации о студентах

        for (int i = 0; i < students.length; i++) {
            System.out.println("Информация о студенте: " + (i + 1));
            students[i].info();
//            System.out.println("------------------------------"); // строка для разделения
//            System.out.println("-------Изменение группы и вывод текущей группы--------"); // строка для разделения

//        //Изменение группы и вывод текущей группы
            student.changeGroup("Java - Новая группа №");
            String newGroup = "Новая группа " + (i + 1);
            students[i].changeGroup(newGroup);
            System.out.println("Новая группа студента: " + students[i].getCurrentGroup());
            System.out.println("------------------------------"); // строка для разделения
//
//        //Изменение оценки и группы
//            int newGrade = 5;
//            String anotherNewGroup = "Java для продвинутых " + (i + 1);
//            students[i].changeGradeAndGroup(newGrade, anotherNewGroup);
//            System.out.println("Новая оценка и группа студента:");
//            students[i].info();
//            System.out.println("------------------------------"); // строка для разделения
        }
    }


}



