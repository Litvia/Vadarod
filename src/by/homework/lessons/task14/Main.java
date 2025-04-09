package by.homework.lessons.task14;

public class Main {
    public static void main(String[] args) {
        // Создание пациентов
        Patient p1 = new Patient(1, "Иван", "Иванов", "Грипп", 30, Gender.MALE);
        Patient p2 = new Patient(2, "Петр", "Петров", "Грипп", 25, Gender.MALE);
        Patient p3 = new Patient(3, "Анна", "Смирнова", "ОРВИ", 28, Gender.FEMALE);
        Patient p4 = new Patient(4, "Федор", "Кутузов", "Грипп", 52, Gender.MALE);

        // Создание палат
        Room maleRoom = new Room(101, RoomType.MALE);
        Room femaleRoom = new Room(102, RoomType.FEMALE);

        // Распределение пациентов
        maleRoom.addPatient(p1);
        maleRoom.addPatient(p2);
        femaleRoom.addPatient(p3);
        maleRoom.addPatient(p4);

        // Создание отделения
        Department department = new Department("Терапевтическое");
        department.addRoom(maleRoom);
        department.addRoom(femaleRoom);

        // Статистика
        System.out.println("Мужчин в отделении: " + department.countMales());
        System.out.println("Женщин в отделении: " + department.countFemales());

        System.out.println("------------------------------"); // строка для разделения
        // Вывод информации о пациентах
        System.out.println(maleRoom.getPatientsInfo());
        System.out.println(femaleRoom.getPatientsInfo());
    }
}

//1. Создать класс пациент (Patient), палата (Room), отделение (Department).
//У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст, пол (сделать enum класс: Мужской, Женский).
//У палаты поля: номер, тип палаты (enum мужская или женская), список пациентов
//У отделения поля: наименование отделения, список палат(коллекция Set)
//2. Создать пациентов. Распределить их по палатам. В одной палате по 3 пациента максимум. При этом попробуйте добавит двух пациентов, с одинаковыми полями. Если количество пациентов в палате увеличилось, значит неправильно реализованы equals и hashСode.
//3. Палаты распределить по отделениям.
//4. Посчитать количество мужчин и женщин в отделении.
//5. Реализовать метод добавления пациента в палату на основе диагноза. Т.е, в палате должны лежать пациенты с одинаковыми диагнозами. Метод реализовать в классе Палата.
//6. В классе Палата создать метод, которые выводить информацию по всем пациентам в палате.
//7*. Сортировать пациентов по идентификационному номеру. (коллекция TreeSet, интерфейс Comparable) Для этого в классе Палата пациенты должны лежать в коллекции TreeSet. А класс пациент должен имплементировать интерфейс Comparable
//

