public class Animal {

    private String type;

    public Animal(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal with " +
                "type " + type;
    }

    void walk(){
        System.out.println("Animal of type " + type + " walks!");
    }
}
