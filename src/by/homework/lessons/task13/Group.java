package by.homework.lessons.task13;

import java.util.List;
import java.util.ArrayList;

public class Group {
    private int groupNumber;
    private List<Student> students;

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

    //Метод add - добавление студентов в группы
    public void addStudent(Student student) {
        students.add(student);

    }

    public void removeStudentsByMark(double minMark){
        students.removeIf(student -> student.getAverageMark() < minMark);
    }

}
