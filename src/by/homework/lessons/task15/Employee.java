package by.homework.lessons.task15;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public Employee(int id, String firstName, String lastName, int age, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName ='" + firstName + '\'' + ", lastName ='" + lastName + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }
}


