package by.homework.lessons.task9;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double averageWeight;

    public Dog(String breed, String color, int maxLifeSpan, String foodType, String name, double averageWeight) {
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
// Переопределение родительского метода игры
    public void play() {
        System.out.println(name + " играет.");
    }

    public void jump() {
        System.out.println(name + " прыгает.");
    }

    // Переопределение родительского родительского метода toString()
    @Override
    public String toString() {
        return "Информация о собаке: " + "имя = " + name + ", порода = " + breed + ", средний вес = " + averageWeight + ", " + super.toString();
    }
}
