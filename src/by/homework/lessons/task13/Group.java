package by.homework.lessons.task13;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupNumber;
    private List <Student> students;

    //Конструктор (Alt + Insert)
    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }


    //Геттеры и сеттеры (Alt + Insert)
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //Метод добавления студентов в группы
    public void addStudent(Student student) {
        students.add(student);

    }

    // Метод удаления студентов с низким средним баллом
    public void removeStudentsByMark(double minMark) {
        students.removeIf(student -> student.getAverageMark() < minMark);
    }

    // Метод перевода студентов в новую группу, если их осталось меньше двух
    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.getStudents().addAll(students);
            students.clear();
        }

    }
    // Расчёт среднего балла группы
    public double calculateAverageMark(){
        if (students.isEmpty()) {
            return 0.0;
        }
        return students.stream()
                .mapToDouble(Student::getAverageMark)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "Группа №" + groupNumber + ": " + students.toString();
    }

}
