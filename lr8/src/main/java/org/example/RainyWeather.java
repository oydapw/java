package org.example;

public class RainyWeather implements Weather{
    @Override
    public String forecast() {
        return "Погода дождливая";
    }
}
