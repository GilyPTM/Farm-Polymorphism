public class Horse extends Animal {

    // Every horse has-a Rider
    Rider rider;
    boolean withShoes;

    Horse() {
        super(AnimalType.HORSE);
    }

    public boolean isWithShoes() {
        return withShoes;
    }

    public void setWithShoes(boolean withShoes) {
        this.withShoes = withShoes;
    }

    void addsRider(Rider rider) {
        this.rider = rider;
    }

    public Rider getRider() {
        return rider;
    }

    @Override
    public String toString() {
        return "Horse (type = " + type + ") has " +
                "rider " + rider +
                ", withShoes: " + withShoes;
    }
}
