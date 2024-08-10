package desingpattern.factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimal("DOG");
        animal1.speak();

        Animal animal2 = animalFactory.getAnimal("CAT");
        animal2.speak();
    }
}
