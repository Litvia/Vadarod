package by.homework.lessons.task9;
//Создать классы: Животное, Собака, Птица.
//Поля в классе животное: окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения).
//Определить методы в классе животное: (издание звуков, животное играет)

public class Animal {
    private String color;
    private int maxLifeSpan;
    private String foodType;

    public Animal(String color, int maxLifeSpan, String foodType) {
        this.color = color;
        this.foodType = foodType;
        this.maxLifeSpan = maxLifeSpan;
    }

    // Общие методы для всех животных
    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    // Метод для издания звука
    public void play() {
        System.out.println("Животное играет");
    }

    @Override
    public String toString() {
        return "Окрас: " + color + ", Максимальная продолжительность жизни: " + maxLifeSpan + ", Тип еды: " + foodType;
    }
}

