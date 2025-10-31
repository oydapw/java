package org.example;
import java.util.*;

public abstract class Employee implements Comparable<Employee> {
    private String fullname;
    private double salary;
    private  int id;

    public Employee(String fullname, int id) {
        this.fullname = fullname;
        this.id = id;
        this.salary = calculateMonthlySalary();
    }

    protected abstract double calculateMonthlySalary();
    public void initSalary() {
        this.salary = calculateMonthlySalary();
    }
    public String getFullname() {
        return fullname;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%d | %-25s | %.2f", id, fullname, salary);
    }
    @Override
    public int compareTo(Employee other) {
        int salaryCompare = Double.compare(other.salary, this.salary);
        if (salaryCompare != 0) return salaryCompare;
        return this.fullname.compareTo(other.fullname);
    }
}

