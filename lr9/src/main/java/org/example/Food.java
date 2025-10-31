package org.example;

public abstract class Food {
    protected String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + this.getClass().getSimpleName() + ")";
    }
}
