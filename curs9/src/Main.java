public class Main {

    public static void main(String[] args) {

        Ferma farm = new Ferma();
        Animal animalCow = farm.putAnimal(AnimalType.COW);
        Animal animalHorse = farm.putAnimal(AnimalType.HORSE);
        Animal anotherAnimal = farm.putAnimal(AnimalType.UNKNOWN);
        Animal animalPig = farm.putAnimal(AnimalType.PIG);

        System.out.println(animalCow);
        animalCow.walk();
        if(animalCow instanceof Cow) {
            ((Cow)animalCow).provideMilk();
        }
        float f = 9.432f;
        int x = (int) f; // cast explicit
        System.out.println(animalHorse);
        animalHorse.walk();
        // animalHorse is-a Horse
        if (animalHorse instanceof Cow) {
            ((Cow)animalHorse).provideMilk();
        } else {
            System.out.println(animalHorse + " cannot provide milk");
        }
        System.out.println(anotherAnimal);
        anotherAnimal.walk();

        System.out.println(animalPig);
        animalPig.walk();

        System.out.println("========================");

        Rider vasilica = new Rider("Vasilica");
        Rider gigel = new Rider("Gigel");
        if (animalHorse instanceof Horse) {
            Horse cal = (Horse) animalHorse;

            cal.addsRider(vasilica);
            System.out.println(animalHorse);

            cal.addsRider(gigel);
            System.out.println(animalHorse);
        }

    }

}