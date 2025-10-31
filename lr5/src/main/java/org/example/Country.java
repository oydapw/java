package org.example;

public class Country {
    private String name;
    private long population;

    public Country() {
        this.name = "Беларусь";
        this.population = 4000000;
    }

    public Country(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if (population >= 0) {
            this.population = population;
        }
    }

    public String getDescription() {
        return "Страна: " + name + ", Население: " + population;
    }
    
}
