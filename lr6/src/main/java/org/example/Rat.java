package org.example;

public class Rat {
    private String name;
    private int age;
    private double weight;
    private String color;

    public Rat(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Rat() {
        this.name = "Крыса";
        this.age = 1;
        this.weight = 0.3;
        this.color = "Белая";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void eat(double foodWeight) {
        if (foodWeight > 0) {
            this.weight += foodWeight * 0.1;
            System.out.println(name + " съела " + foodWeight + " кг еды и теперь весит " + weight + " кг.");
        }
    }

    public void run() {
        System.out.println(name + " бегает");
    }

    public void displayInfo() {
        System.out.println("Информация о крысе: Имя = " + name + ", Возраст = " + age + ", Вес = " + weight + " кг, Цвет = " + color);
    }
}
