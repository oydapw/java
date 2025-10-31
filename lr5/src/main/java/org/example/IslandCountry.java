package org.example;

public class IslandCountry extends Country {
    private int islandCount;

    public IslandCountry(String name, long population, int islandCount) {
        super(name, population);
        this.islandCount = islandCount;
    }

    public int getIslandCount() {
        return islandCount;
    }

    public void setIslandCount(int islandCount) {
        if (islandCount >= 0) {
            this.islandCount = islandCount;
        }
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Номер острова: " + islandCount;
    }
}
