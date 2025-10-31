package org.example;

public abstract class   Weather {
    public String city;
    public Weather(String city)
    {
        this.city = city;
    }
    public abstract String prognoz();

}
