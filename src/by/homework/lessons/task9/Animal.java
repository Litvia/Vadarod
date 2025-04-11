package by.homework.lessons.task9;
//Создать классы: Животное, Собака, Птица.
//Поля в классе животное: окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения).
//Определить методы в классе животное: (издание звуков, животное играет)

import java.util.Objects;

public class Animal {
    protected String color;
    protected int maxLifeSpan;
    protected String foodType;


    public Animal(String color, int maxLifeSpan, String foodType) {
        this.color = color;
        this.maxLifeSpan = maxLifeSpan;
        this.foodType = foodType;
    }

    // Общие методы для всех животных
    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    // Метод для издания звука
    public void play() {
        System.out.println("Животное играет");
    }

    // Метод, который будет выводить информацию о собаке, птице, животном (toString)

    public String toString() {
        return "окрас = " + color + ", максимальная продолжительность жизни = " + maxLifeSpan + ", тип еды = " + foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return maxLifeSpan == animal.maxLifeSpan
                && Objects.equals(color, animal.color)
                && Objects.equals(foodType, animal.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, maxLifeSpan, foodType);
    }
}