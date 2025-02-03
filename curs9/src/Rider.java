public class Rider {

    private String name;

    Rider(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rider " +
                name;
    }
}