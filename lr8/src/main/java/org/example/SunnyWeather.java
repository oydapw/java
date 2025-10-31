package org.example;

public class SunnyWeather implements Weather{
    @Override
    public String forecast() {
        return "Погода тёплая";
    }
}
