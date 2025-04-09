package by.homework.lessons.task13;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String facultyName;
    private List<Group> groups;
    private boolean isActive;

    //Конструктор (Alt + Insert)
    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        this.groups = new ArrayList<>();
        this.isActive = true;
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

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }


    //Метод add - добавление групп в факультеты
    public void addGroup(Group group) {
        groups.add(group);
    }

    // Метод изменения статуса активности факультета
    public void changeStatusOfActivityFaculty() {
        int totalStudents = groups.stream().mapToInt(group -> group.getStudents().size()).sum();
        if (totalStudents < 20) {
            setIsActive(false);
        }
    }
}


