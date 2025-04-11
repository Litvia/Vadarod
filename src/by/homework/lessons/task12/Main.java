package by.homework.lessons.task12;

//Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle (транспорт)
//1.1 Создать поле name и количество выбросов(Integer) в классе Vehicle и проинициализировать его через конструктора.
//1.2 Реализовать методы геттеры и сеттеры для соответствующих полей класса Vehicle
//1.3 Создать generic класс Garage<T extends Vehicle >, который может хранить только объекты типа наследуемого от Vehicle.
//1.4 Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж в зависимости от количество выбросов транспортного средства. (Boolean isEntryPermitted());
//Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.
//1.5 Класс Main. Создать 2 объекта класса Garage. Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж

public class Main {

    public static void main(String[] args) {

        // Создание объектов гаражей
        Garage<Car> carGarage = new Garage<>(new Car("BMW", 95));
        Garage<Motorcycle> motorcycleGarage = new Garage<>(new Motorcycle("Harley-Davidson", 105));


        System.out.println("Car: " + carGarage.getVehicle().getName());
        System.out.println("Entry permitted: " + carGarage.isEntryPermitted());

        System.out.println("------------------------------"); // строка для разделения

        System.out.println("Motorcycle: " + motorcycleGarage.getVehicle().getName());
        System.out.println("Entry permitted: " + motorcycleGarage.isEntryPermitted());
    }

}
