package me.blaketnr;

public class Guitar {
    private String serialNumber;
    private GuitarSpec guitarSpec;
    private double price;

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }
}