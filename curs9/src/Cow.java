public class Cow extends Animal{

    private boolean withSpots;
    private float kg;

    Cow(){
        super("Cow");
    }

    public boolean isWithSpots() {
        return withSpots;
    }

    public void setWithSpots(boolean withSpots) {
        this.withSpots = withSpots;
    }

    public float getKg() {
        return kg;
    }

    public void setKg(float kg) {
        this.kg = kg;
    }

    void provideMilk(){
        System.out.println("Cow provides milk!");
    }
}
