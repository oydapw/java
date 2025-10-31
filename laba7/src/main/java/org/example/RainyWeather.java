package org.example;

public  class RainyWeather extends Weather {
    public RainyWeather(String city)
    {
        super(city);
    }
    @Override
    public String prognoz() {
        return "Вероятны осадки";
    }

}
