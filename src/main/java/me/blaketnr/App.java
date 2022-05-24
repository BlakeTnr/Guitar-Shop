package me.blaketnr;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, Type.ELECTRIC, "Stratocastor", Wood.ALDER,
                Wood.ALDER);
        List<Guitar> guitar = inventory.search(whatErinLikes);
        if (!guitar.isEmpty()) {
            printMatchingGuitars(guitar);
        } else {
            System.out.println("Sorry, Erin, we have noting for you.");
        }
    }

    private static void printMatchingGuitars(List<Guitar> guitars) {
        for (int i = 0; i < guitars.size(); i++) {
            System.out.println(getGuitarText(guitars.get(i)));
        }
    }

    private static String getGuitarText(Guitar guitar) {
        String guitarText = guitar.getSerialNumber() + " " + guitar.getGuitarSpec().getBuilder().toString() + " "
                + guitar.getGuitarSpec().getType().toString() + " " + guitar.getGuitarSpec().getBackWood().toString()
                + " "
                + guitar.getGuitarSpec().getTopWood().toString() + " " + String.valueOf(guitar.getPrice());
        return guitarText;
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("1", 1, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);
    }
}