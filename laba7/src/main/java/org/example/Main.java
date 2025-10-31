package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Weather sunny = new SunnyWeather("Gomel");
        SunnyWeather s = new SunnyWeather("");
        Weather rainy = new RainyWeather("Minsk");
        System.out.println(sunny.prognoz());
        System.out.println(rainy.prognoz());
        System.out.println(s.prognoz());
    }
}