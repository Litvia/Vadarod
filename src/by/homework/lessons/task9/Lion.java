package by.homework.lessons.task9;

public class Lion extends  Animal{

    public Lion(String color, int maxLifeSpan, String foodType) {
        super(color, maxLifeSpan, foodType);
    }

    // Переопределение родительского метода издает звуки
    public void makeSound() {
        System.out.println("Лев рычит");
    }

    // Переопределение родительского метода игры
    public void play() {
        System.out.println("Лев играет");
    }

    // Переопределение родительского родительского метода toString()

    @Override
    public String toString() {
        return "Информация о льве: " + super.toString();
    }
}
