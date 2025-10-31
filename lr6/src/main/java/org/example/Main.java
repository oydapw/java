package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rat rat1 = new Rat("Лега", 4, 0.2, "Чёрная");
        Rat rat2 = new Rat();

        rat1.displayInfo();
        rat1.eat(0.1);
        rat1.run();

        rat2.displayInfo();
        rat2.setName("Геннадий");
        rat2.displayInfo();

        Drob drob1 = new Drob(1, 2);
        Drob drob2 = new Drob(3, 4);

        System.out.println("Дробь 1:");
        drob1.display();

        System.out.println("Дробь 2:");
        drob2.display();

        System.out.println("Сложение:");
        Drob sum = drob1.plus(drob2);
        sum.display();

        System.out.println("Вычитание:");
        Drob diff = drob1.minus(drob2);
        diff.display();

        System.out.println("Умножение:");
        Drob product = drob1.umn(drob2);
        product.display();

        System.out.println("Деление:");
        Drob quotient = drob1.delenie(drob2);
        quotient.display();
    }
    }
