package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DevelopedCountry devCountry = new DevelopedCountry("Япония", 423424000, 200);
        DevelopingCountry devingCountry = new DevelopingCountry("Эльс", 428600000, 1);
        IslandCountry islandCountry = new IslandCountry("Норвегия", 290500000, 17);

        System.out.println(devCountry.getDescription());
        System.out.println(devingCountry.getDescription());
        System.out.println(islandCountry.getDescription());

        devCountry.setVvp(42_000);
        devingCountry.setDevelopmentIndex(0.78);
        islandCountry.setIslandCount(17_510);

        System.out.println("После обновы:");
        System.out.println(devCountry.getDescription());
        System.out.println(devingCountry.getDescription());
        System.out.println(islandCountry.getDescription());
    }
}