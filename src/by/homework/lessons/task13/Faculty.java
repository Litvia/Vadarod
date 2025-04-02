package by.homework.lessons.task13;

import java.util.List;
import java.util.ArrayList;

public class Faculty {
    private String facultyName;
    private List<Group> groups;

    //Конструктор (Alt + Insert)
    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        this.groups = new ArrayList<>();
    }

    //Геттеры и сеттеры (Alt + Insert)
    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Group> getGroup() {
        return groups;
    }

    public void setGroup(List<Group> groups) {
        this.groups = groups;
    }

    //Метод add - добавление групп в факультеты
    public void addGroup(Group group) {
        groups.add(group);
    }
}

