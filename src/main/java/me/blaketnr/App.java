package me.blaketnr;

public class App {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        Guitar guitar = inventory.search(whatErinLikes);
        if (guitar != null) {
            System.out.println("Erin, you might like this " + guitar.toString());
        } else {
            System.out.println("Sorry, Erin, we have noting for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("1", 1, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}
