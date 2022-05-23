package me.blaketnr;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        List<Guitar> guitar = inventory.search(whatErinLikes);
        if (guitar != null) {
            printMatchingGuitars(guitar);
        } else {
            System.out.println("Sorry, Erin, we have noting for you.");
        }
    }

    private static void printMatchingGuitars(List<Guitar> guitars) {
        for(int i=0; i<guitars.size(); i++) {
            System.out.println(getGuitarText(guitars.get(i)));
        }
    }

    private static String getGuitarText(Guitar guitar) {
        String guitarText = guitar.getSerialNumber() + " " + guitar.getBuilder().toString() + " " + guitar.getType().toString() + " " + guitar.getBackWood().toString() + " " + guitar.getTopWood().toString() + " " + String.valueOf(guitar.getPrice());
        return guitarText;
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("1", 1, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}