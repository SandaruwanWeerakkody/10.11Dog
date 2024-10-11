public class Yorkshire extends Dog {
    public Yorkshire(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Yap!";
    }

    @Override
    public int avgBreedWeight() {
        return 10; // Example average weight for a Yorkshire
    }
}
