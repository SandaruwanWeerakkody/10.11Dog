public class testDog {
    public static void main(String[] args) {

        Dog lab = new Labrador("Bull", "Golden");
        Dog yorkie = new Yorkshire("sudu");

        System.out.println(lab.getName() + " says " + lab.speak());
        System.out.println(yorkie.getName() + " says " + yorkie.speak());


        poke(lab);
        poke(yorkie);
    }

    public static void poke(Dog d) {
        System.out.println(d.getName() + " says " + d.speak());

    }
}
