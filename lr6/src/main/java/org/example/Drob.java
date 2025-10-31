package org.example;

public class Drob {
    private Number numerator;
    private Number denominator;



    public Drob(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Знаменатель не может быть нулем.");
        }
        this.numerator = new Number(numerator);
        this.denominator = new Number(denominator);
        simplify();
    }

    private void simplify() {
        int gcd = NOD(Math.abs(numerator.getValue()), Math.abs(denominator.getValue()));
        numerator.setValue(numerator.getValue() / gcd);
        denominator.setValue(denominator.getValue() / gcd);
    }

    private int NOD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void display() {
        System.out.println(numerator.getValue() + "/" + denominator.getValue());
    }

    public Drob plus(Drob other) {
        int newNumerator = numerator.getValue() * other.denominator.getValue() +
                other.numerator.getValue() * denominator.getValue();
        int newDenominator = denominator.getValue() * other.denominator.getValue();
        return new Drob(newNumerator, newDenominator);
    }

    public Drob minus(Drob other) {
        int newNumerator = numerator.getValue() * other.denominator.getValue() -
                other.numerator.getValue() * denominator.getValue();
        int newDenominator = denominator.getValue() * other.denominator.getValue();
        return new Drob(newNumerator, newDenominator);
    }

    public Drob umn(Drob other) {
        int newNumerator = numerator.getValue() * other.numerator.getValue();
        int newDenominator = denominator.getValue() * other.denominator.getValue();
        return new Drob(newNumerator, newDenominator);
    }

    public Drob delenie(Drob other) {
        if (other.numerator.getValue() == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        int newNumerator = numerator.getValue() * other.denominator.getValue();
        int newDenominator = denominator.getValue() * other.numerator.getValue();
        return new Drob(newNumerator, newDenominator);
    }
}
