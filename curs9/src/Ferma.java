public class Ferma {

    Animal putAnimal(AnimalType type) {
        switch (type) {
            case COW: // Cow
                Cow cow = new Cow();
                return cow;
            case HORSE:
                Horse horse = new Horse();
                return horse;
            case PIG:
                Pig pig = new Pig();
                return pig;
        }
        Animal animal = new Animal(AnimalType.UNKNOWN);
        return animal;
    }

}