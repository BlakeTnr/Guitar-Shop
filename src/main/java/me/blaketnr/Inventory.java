package me.blaketnr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
            Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price,
                new GuitarSpec(Builder.FENDER, Type.ELECTRIC, "Stratocastor", Wood.ALDER, Wood.ALDER));
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitar) {
        List<Guitar> matchingGuitars = new ArrayList<Guitar>();
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();

            if (searchGuitar.comparable(guitar.getGuitarSpec())) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
}
