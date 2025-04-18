package by.homework.lessons.task17_2;

import java.io.*; // Библиотека для работы с файлами ввода-вывода и потоками объектов (ObjectOutputStream, ObjectInputStream), которые используются для сохранения и загрузки объектов.

public class Main {

    public static void main(String[] args) {
        // Создание объекта
        Car car = new Car("Toyota", 240, "Japan");

        // Сериализация
        serializeCar(car, "car.txt");

        // Десериализация и вывод
        Car deserializedCar = deserializeCar("car.txt");
        System.out.println("Десериализованный автомобиль: " + deserializedCar);
    }

    // Метод для сериализации (сохраняет объект в файл)
    public static void serializeCar(Car car, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(car);
            System.out.println("Сериализация успешна!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для десериализации (читает объект из файла)
    public static Car deserializeCar(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Car) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

