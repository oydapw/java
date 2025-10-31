package org.example;

public class SunnyWeather extends Weather {
    public SunnyWeather(String city)
    {
        super(city);
    }
    @Override
public String prognoz() {
    return "Ожидается солнечная погода";
}

}
