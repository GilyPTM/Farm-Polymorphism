public class Ferma {

    public static void main(String[] args) {

        Animal animalCow = receiveAnimal(1);
        Animal animalHorse = receiveAnimal(2);
        Animal anotherAnimal = receiveAnimal(4994);

        System.out.println(animalCow);
        animalCow.walk();
            if(animalCow instanceof Cow){
                ( (Cow) animalCow).provideMilk();
            }

        System.out.println(animalHorse);
        animalHorse.walk();
        if (animalHorse instanceof Cow){
            ((Cow)animalHorse).provideMilk();
        } else {
            System.out.println(animalHorse + " cannot provide milk!");
        }
        System.out.println(anotherAnimal);
        anotherAnimal.walk();
    }

    static Animal receiveAnimal(int type) {
        switch (type) {
            case 1:
                Cow cow = new Cow();
                return cow;
            case 2:
                Horse horse = new Horse();
                return horse;

        }
        return null;
    }
}
