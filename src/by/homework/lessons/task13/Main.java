package by.homework.lessons.task13;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Создание студентов
        Student s1 = new Student("Иван", "Иванов", LocalDate.of(1983, 12, 01), "Минск", 4.5);
        Student s2 = new Student("Петр", "Петров", LocalDate.of(1996, 03, 19), "Брест", 4.7);
        Student s3 = new Student("Артем", "Кулик", LocalDate.of(2005, 02, 22), "Гродно", 3.5);

        //Создание групп
        Group g1 = new Group(101);
        Group g2 = new Group(102);
        Group g3 = new Group(103);

        // Распределение студентов по группам
        g1.addStudent(s1);
        g2.addStudent(s2);
        g3.addStudent(s3);

        //Создание факультета
        Faculty f1 = new Faculty("Информатика 101");
        Faculty f2 = new Faculty("Информатика 102");
        Faculty f3 = new Faculty("Информатика 103");

        // Распределение групп по факультетам
        f1.addGroup(g1);
        f2.addGroup(g2);
        f3.addGroup(g3);

        // Удаляем студентов с низким средним баллом (мин 4 балла)
        g1.removeStudentsByMark(4.0);
        g2.removeStudentsByMark(4.0);
        g3.removeStudentsByMark(4.0);

    }

}
//Задачи
//2. Создать класс студент (Student), группа (Group), факультет (Faculty).
// У студента поля: имя, фамилия, дата рождения, город рождения, средний бал.
// У группы: номер группы, коллекция студентов (List<Student> students).
// У факультета: наименование факультета, список групп (List<Group> groups. )
// Реализовать во всех классах методы геттеры и сеттеры для соответствующих полей (можно сгенерировать с помощью идеи. Используйте для этого комбинацию клавиш Alt+Insert.
//1.1. Создать несколько студентов.
//1.2. Создать несколько групп. По этим группам распределить студентов. (метод колле
//    }кции add)
//1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)
//1.4. Реализовать метод в классе Group, который должен пройти по всем студентам в группе и удалить тех, у кого средний бал ниже переданной оценки в параметре метода. (метод remove).
//Сигнатура метода: public void removeStudentsByMark(int mark);
//1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll());
// Сигнатура метода: public void transferToGroup(Group newGroup);
//1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.
//1.7*. Добавить поле для факультета энамовского типа: ACTIVE (Активный) и NOT_ACTIVE (Неактивный факультет). Реализовать геттеры и сеттеры.
//1.8* Реализовать метод по смене статуса факультета: Еслиобщее количество студентов на факультете меньше 20-сделать факультет неактитвным. (Метод size() вколлекции)
//1.9*. Вывести студентов в порядке возрастания среднего бала
//1.10*. Вывести студентов в порядке убывания среднего бала

