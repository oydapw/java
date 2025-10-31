package org.example;

public class FixedSalaryEmployee extends Employee{
    private double fixedSalary;

    public FixedSalaryEmployee(String fullname, int id, double fixedSalary) {
        super(fullname, id);
        this.fixedSalary = fixedSalary;
        initSalary();
    }

    @Override
    protected double calculateMonthlySalary() {
        return fixedSalary;
    }
}
