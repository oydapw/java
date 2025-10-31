package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Высокий", 1500.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + " " + surname + ", Опыт работы: " + experienceInYears + " лет, Уровень английского: " + englishLevel + ", Зарплата: " + salary);
    }

    public void printInfo(boolean shortVersion) {
        if (shortVersion) {
            System.out.println("Имя: " + name + " " + surname + ", Зарплата: " + salary);
        } else {
            printInfo();
        }
    }

    public void printInfo(double bonus, String message) {
        salary += bonus;
        System.out.println(message + " - Зарплата с премией: " + salary);
    }

    public static double calculateAverageSalary(double salary1, double salary2) {
        return (salary1 + salary2) / 2;
    }
}