package org.example;


public class Main {
    public static void main(String[] args) {
        double avgSalary = Tester.calculateAverageSalary(1500, 2500);
        System.out.println("Средняя зп:  " + avgSalary);

        Tester maks = new Tester("Максим ", "Лепешов");
        maks.printInfo();
        maks.printInfo(true);
        maks.printInfo(false);
        maks.printInfo(1000.0, "Премия!");
        }
    }
