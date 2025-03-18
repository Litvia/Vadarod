package by.homework.lessons.task9;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double averageWeight;

    public Dog(String color, int maxLifeSpan, String foodType, String name, String breed, double averageWeight) {
        super(color, maxLifeSpan, foodType);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

// Методы для различных действий собак
    public void bark() {
        System.out.println(name + " лает.");
    }

    public void bite() {
        System.out.println(name + " кусает.");
    }

    public void run() {
        System.out.println(name + " бежит.");
    }

    public void play() {
        System.out.println(name + " играет.");
    }

    public void jump() {
        System.out.println(name + " прыгает.");
    }
    @Override
    public String toString() {
        return "Имя: " + name + ", Порода: " + breed + ", Средний вес: " + averageWeight +
                "\n" + super.toString();
    }
}
