package by.homework.lessons.task11;

public interface Robot {
    default void repair() {
        // Дефолтный метод: ремонт робота
        System.out.println("Ремонт робота");
    }

    // Абстрактные методы
    void turnOn();

    void turnOff();

    void showUniqueAbility();
}

