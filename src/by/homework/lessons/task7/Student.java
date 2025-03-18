package by.homework.lessons.task7;
//Задание 1. Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ), course(тип int), Группа(тип String), средняя оценка (тип int).
//Инициализацию студента в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.

public class Student {
    private int id;
    private String name;
    private String surname;
    private String faculty;
    private int course;
    private String group;
    private int averageMark;

    // Конструктор без параметров
    public Student() {
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.faculty = "";
        this.course = 0;
        this.group = "";
        this.averageMark = 0;
    }

    // Конструктор с параметрами
    public Student(int id, String name, String surname, String faculty, int course, String group, int averageMark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageMark = averageMark;
    }

//Задание 2. Создать метод, который будет выводить информацию по полям, которые есть в классе и назвать его info

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Группа: " + group);
        System.out.println("Средняя оценка: " + averageMark);

    }

//Задание 3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)

    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

//Задание 4. Создать метод, который будет возвращать текущую группу студента.

    public String getCurrentGroup() {
        return group;
    }

//Задание 5. Создать метод, который будет изменять оценку студента и группу студента одновременно.

    public void updateMarkAndGroup(int newMark, String newGroup) {
        this.averageMark = newMark;
        this.group = newGroup;
    }

// Метод для фильтрации студентов по средней оценке

    public Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        for (Student student : students) {
            if (student.averageMark > mark) {
                count++;
            }
        }
 // Создание нового массива для найденных подходящих студентов
        Student[] result = new Student[count];
        int index = 0;
        for (Student student : students) {
            if (student.averageMark > mark) {
                result[index] = student;
                index++;
            }
        }
        return result;
    }

    private int averageMark() {
        return 0;
    }
}