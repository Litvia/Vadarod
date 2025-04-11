package by.homework.lessons.task10;

import by.homework.lessons.task9.Bird;
import by.homework.lessons.task9.Dog;

public class Main {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("бультерьер", "триколор", 14, "мясо", "Яша", 15.5);
        dogs[1] = new Dog("такса", "черная", 16, "мясо", "Кольт", 10);


        Bird[] birds = new Bird[3];
        birds[0] = new Bird("серый", 3, "насекомые", "воробей", 80);
        birds[1] = new Bird("черный", 5, "зерно", "голубь", 90);

        System.out.println(dogs[0].equals(dogs[1]));
        System.out.println(birds[0].equals(birds[1]));

        System.out.println(dogs[0].hashCode() == dogs[1].hashCode());
        System.out.println(birds[0].hashCode() == birds[1].hashCode());
    }
}
