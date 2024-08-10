package desingpattern.factory;

public class AnimalFactory {
    public Animal getAnimal(String animalType) {
        if (animalType == "DOG") {
            return new Dog();
        } else if (animalType == "CAT") {
            return new Cat();
        }
        return null;
    }
}
