package org.example;

public class DevelopedCountry extends Country {
    private double vvp;

    public DevelopedCountry(String name, long population, double vvp) {
        super(name, population);
        this.vvp = vvp;
    }

    public double getVvp() {
        return vvp;
    }

    public void setVvp(double vvp) {
        if (vvp >= 0) {
            this.vvp = vvp;
        }
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", ВВП на душу населения: $" + vvp;
    }
}