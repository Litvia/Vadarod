package by.homework.lessons.task9;

public class Bird extends Animal{
    private String family;
    private int maxFlightHeight;

    public Bird(String color, int maxLifeSpan, String foodType, String family, int maxHeight){
        super(color, maxLifeSpan, foodType);
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

// Методы для различных действий птиц
    public void sing (){
        System.out.println(family + " поет.");
    }

    public void peck (){
        System.out.println(family + " клюёт.");
    }

    public void incubate(){
        System.out.println(family + " высиживает птенцов.");
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }
}