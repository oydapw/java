package org.example;

public class DevelopingCountry extends Country  {
    private double developmentIndex;

    public DevelopingCountry(String name, long population, double developmentIndex) {
        super(name, population);
        this.developmentIndex = developmentIndex;
    }

    public double getDevelopmentIndex() {
        return developmentIndex;
    }

    public void setDevelopmentIndex(double developmentIndex) {
        if (developmentIndex >= 0 && developmentIndex <= 1) {
            this.developmentIndex = developmentIndex;
        }
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Индекс: " + developmentIndex;
    }
}
