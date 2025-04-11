package by.homework.lessons.task12;

public class Garage<T extends Vehicle> {
    private final T vehicle;

    // Конструктор
    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    // Метод для проверки разрешения на въезд
    public boolean isEntryPermitted() {
        return vehicle.getEmissions() <= 100;
    }

    // Геттер для получения хранимого транспортного средства
    public T getVehicle() {
        return vehicle;
    }
}
