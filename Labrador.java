public class Labrador extends Dog {
    private String color;

    public Labrador(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public String speak() {
        return "Woof!";
    }

    @Override
    public int avgBreedWeight() {
        return 75; // Example average weight for a Labrador
    }
}
