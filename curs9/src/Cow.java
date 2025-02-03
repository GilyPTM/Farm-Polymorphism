public class Cow extends Animal {

    private boolean withSpots;
    private float kg;

    Cow() {
        super(AnimalType.COW);
    }

    // getter
    public boolean isWithSpots() {
        return withSpots;
    }

    // setter
    public void setWithSpots(boolean withSpots) {
        this.withSpots = withSpots;
    }

    // getter
    public float getKg() {
        return kg;
    }

    // setter
    public void setKg(float kg) {
        this.kg = kg;
    }

    void provideMilk() {
        System.out.println("Cow provides milk");
    }

}