package org.example;
import java.util.*;

public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private int hoursPerMonth;

    public HourlyEmployee(String fullname, int id, double hourlyRate, int hoursPerMonth) {
        super(fullname, id);
        this.hourlyRate = hourlyRate;
        this.hoursPerMonth = hoursPerMonth;
        initSalary();
    }

    @Override
    protected double calculateMonthlySalary() {
        return hourlyRate * hoursPerMonth;
    }
}
