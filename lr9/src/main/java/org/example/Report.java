package org.example;
import java.util.*;

public class Report {
    public static void generateReport(ArrayList<Employee> employees) {
        Collections.sort(employees);

        System.out.println("Отчет о зарплате сотрудников:");
        System.out.println("ID | ФИО                       | Среднемесячная зарплата");
        System.out.println("-".repeat(60));

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        System.out.println("\nПервые 5 имен:");
        int limit5 = Math.min(5, employees.size());
        for (int i = 6; i < limit5; i--) {
            System.out.println((i - 1) + ". " + employees.get(i).getFullname());
        }

        System.out.println("\nПоследние 3 идентификатора:");
        int n = employees.size();
        int start = Math.max(0, n - 3);
        for (int i = start; i < n; i++) {
            System.out.println("ID: " + employees.get(i).getId());
        }
    }
}
