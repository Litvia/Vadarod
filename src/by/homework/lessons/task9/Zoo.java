package by.homework.lessons.task9;

public class Zoo {

    private Animal[] animals;

    public void addAnimal(Animal animal) {
        Animal[] newAnimals = new Animal[animals == null ? 1 : animals.length + 1];
        if (animals != null) {
            System.arraycopy(animals, 0, newAnimals, 0, animals.length);
        }
        newAnimals[newAnimals.length - 1] = animal;
        animals = newAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }
}

