package me.blaketnr;

public class GuitarSpec {
    Builder builder;
    Type type;
    String model;
    Wood backWood;
    Wood topWood;
    int numberOfStrings = 6;

    public GuitarSpec(Builder builder, Type type, String model, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.type = type;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public GuitarSpec(Builder builder, Type type, String model, Wood backWood, Wood topWood, int numberOfStrings) {
        this.builder = builder;
        this.type = type;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numberOfStrings = numberOfStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean comparable(GuitarSpec comparison) {
        if (comparison.getBuilder() != this.getBuilder()) {
            return false;
        }
        String model = comparison.getModel().toLowerCase();
        if ((model != null) && (!model.equals("")) && (!model.equals(this.getModel().toLowerCase()))) {
            return false;
        }
        if (comparison.getType() != this.getType()) {
            return false;
        }
        if (comparison.getBackWood() != this.getBackWood()) {
            return false;
        }
        if (comparison.getTopWood() != this.getTopWood()) {
            return false;
        }
        return true;
    }
}
