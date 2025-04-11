package by.homework.lessons.task15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Создание сотрудников
        Employee emp1 = new Employee(1, "Иван", "Иванов", 30,  2000);
        Employee emp2 = new Employee(2, "Петр", "Петров", 25, 2500);
        Employee emp3 = new Employee(3, "Сергей", "Сергеев", 35, 3000);
        Employee emp4 = new Employee(4, "Александр", "Алексеев", 40, 3500);
        Employee emp5 = new Employee(5, "Михаил", "Михайлов", 45, 4000);
        Employee emp6 = new Employee(6, "Николай", "Николаев", 50, 4500);
        Employee emp7 = new Employee(7, "Дмитрий", "Дмитриев", 55, 5000);
        Employee emp8 = new Employee(8, "Владимир", "Владимиров", 60, 5500);


        // Создание мапки
        Map<Employee, String> employees = new HashMap<>();
        employees.put(emp1, "Плотник");
        employees.put(emp2, "Плотник");
        employees.put(emp3, "Сварщик");
        employees.put(emp4, "Сварщик");
        employees.put(emp5, "Электрик");
        employees.put(emp6, "Электрик");
        employees.put(emp7, "Сантехник");
        employees.put(emp8, "Сантехник");

        // Вызываем статический метод raiseSalaryForProfession для повышение зарплаты
        raiseSalaryForProfession(employees, 200);


        // Вызываем метод createProfessionMap, который преобразует исходную мапку (где ключ — сотрудник, значение — профессия) в новую мапку, где ключ: профессия (тип String).
        // Значение: коллекция сотрудников (тип Collection<Employee>), имеющих эту профессию.

        Map<String, Collection<Employee>> professionMap = createProfessionMap(employees);

        // Вывод содержимого новой мапки
        // Перебирает все записи (пары ключ-значение) в professionMap через entrySet().
        // Для каждой профессии (ключа) выводит её название:
        // Перебирает всех сотрудников из коллекции (значения) и выводит их данные через System.out.println(employee).

        for (Map.Entry<String, Collection<Employee>> entry : professionMap.entrySet()) {
            System.out.println("------------------------------"); // строка для разделения
            System.out.println("Профессия: " + entry.getKey());
            for (Employee employee : entry.getValue()) {
                System.out.println(employee);
            }
        }
    }


    // Вызываем статический метод raiseSalaryForProfession для повышение зарплаты сотрудникам определенной профессии
    // Метод принимает два параметра: employees: Это мапка (Map<Employee, String>) содержащая сотрудников в качестве ключей и их профессии в качестве значений.

    private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            if (entry.getValue().equals("Плотник")) {
                int newSalary = entry.getKey().getSalary() + amountOfIncrease;
                entry.getKey().setSalary(newSalary);
                System.out.println("Зарплата сотрудника " + entry.getKey().getFirstName() + " " + entry.getKey().getLastName() + " повышена до " + newSalary);
            }
        }
    }

    // Метод для создания мапки с профессиями в качестве ключей
    // Создаём пустую мапку professionMap.
    // Для каждой записи в исходной мапке: Получаем профессию сотрудника (entry.getValue()).
    // Если такой профессии ещё нет в professionMap, добавляем её с пустым списком (new ArrayList<>()).
    // Добавляем сотрудника (entry.getKey()) в список, соответствующий его профессии.

    private static Map<String, Collection<Employee>> createProfessionMap(Map<Employee, String> employees) {
        Map<String, Collection<Employee>> professionMap = new HashMap<>();

        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            String profession = entry.getValue();
            if (!professionMap.containsKey(profession)) {
                professionMap.put(profession, new ArrayList<>());
            }
            professionMap.get(profession).add(entry.getKey());
        }

        return professionMap;
    }
}

//1.Создать класс. Сотрудник(Employee)
//2.Поля у сотрудника: Идентификационный номер, Имя, фамилия, возраст, зарплата.
//3.Создать 8 сотрудников.
//4.Создать мапку и записать туда созданных сотрудников в качестве ключа, а в качестве значения присвоить им профессию.
//5 Реализуйте статический метод в классе Main, который повысит зарплату сотрудникам одной профессии.
//Сигнатура метода к примеру такая: private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease).
//Например: необходимо повысить зарплату плотникам на 200 рублей. (Обратите внимание на метод entrySet).
//6*. Необходимо написать метод, который будет из мапки описанной в п.1.4 создаст мапку типа HashMap<String, Collection<Сотрудник>>.
//Т.е, поменять местами квалификацию сотрудника (в качестве ключа будет выступать квалификация, в качестве значения - коллекция сотрудников).