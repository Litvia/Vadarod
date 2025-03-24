package by.homework.lessons.task9;

public class Main {
    public static void main(String[] args) {
//Создаем массив c собаками
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("бультерьер", "триколор", 14, "мясо", "Яша", 15.5);
        dogs[1] = new Dog("такса", "черная", 16, "мясо", "Кольт", 10);
        dogs[2] = new Dog("акита", "рыжий", 12, "мясо", "Ким", 25);

//Создаем птицу
        Bird[] birds = new Bird[3];
        birds[0] = new Bird("серый", 3, "насекомые", "воробей", 80);
        birds[1] = new Bird("черный", 5, "зерно", "голубь", 90);
        birds[2] = new Bird("коричневый", 6, "насекомые", "соловей", 100);

        //Создаем льва
        Lion[] lions = new Lion[3];
        lions[0] = new Lion("Золотистый", 20, "мясо");
        lions[1] = new Lion("Белый", 22, "мясо");
        lions[2] = new Lion("Черный", 18, "мясо");

        //Создаем объект зоопарк
        Zoo zoo = new Zoo();

        //Добавляем животных в зоопарк
        zoo.addAnimal(dogs[0]);
        zoo.addAnimal(dogs[1]);
        zoo.addAnimal(dogs[2]);
        zoo.addAnimal(birds[0]);
        zoo.addAnimal(birds[1]);
        zoo.addAnimal(birds[2]);
        zoo.addAnimal(lions[0]);
        zoo.addAnimal(lions[1]);
        zoo.addAnimal(lions[2]);

//Действия собаки
        System.out.println("=== Демонстрация поведения собаки ===");
        dogs[0].bark();
        dogs[0].bite();
        dogs[0].run();
        dogs[0].play();
        dogs[0].jump();

        System.out.println("------------------------------"); // строка для разделения
//Действия птицы
        System.out.println("=== Демонстрация поведения птицы ===");
        birds[0].makeSound();
        birds[0].peck();
        birds[0].incubate();
        birds[0].makeSound();

// Вывод информации
        System.out.println("------------------------------"); // строка для разделения
// Информация о собаке
        for (Dog dog : dogs)
            System.out.println(dog);

        System.out.println("------------------------------"); // строка для разделения
// Информация о птице
        for (Bird bird : birds)
            System.out.println(bird);

        System.out.println("------------------------------"); // строка для разделения

// Информация о льве
        for (Lion lion : lions)
            System.out.println(lion);

        System.out.println("------------------------------"); // строка для разделения

        // Демонстрация поведения
        Animal[] animals = zoo.getAnimals();
        for (Animal animal : animals) {
            animal.makeSound();
            animal.play();
            System.out.println(animal);
        System.out.println("------------------------------"); // строка для разделения
        }
    }
}