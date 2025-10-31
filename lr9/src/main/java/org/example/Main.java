package org.example;
import java.util.*;
public class Main {

    public static void runProductsAndStudents() {
        Map<String, Food> products = new HashMap<>();
        products.put("яблоко", new Fruit("яблоко"));
        products.put("банан", new Fruit("банан"));
        products.put("морковь", new Vegetable("морковь"));
        products.put("картофель", new Vegetable("картофель"));
        products.put("апельсин", new Fruit("апельсин"));

        System.out.println("Все продукты (ключи):");
        for (String key : products.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nВсе продукты с типом:");
        for (Map.Entry<String, Food> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Лепешов Максим", "Т-319", 4);
        s1.addGrade("ОКП", 7);
        s1.addGrade("БД", 6);
        s1.addGrade("ОснПредД", 5);

        Student s2 = new Student("Шапик Ромка", "Т-319", 4);
        s2.addGrade("ОКП", 2);
        s2.addGrade("БД", 2);
        s2.addGrade("ОснПредД", 3);

        Student s3 = new Student("Коваленя Роман", "Т-319", 2);
        s3.addGrade("ОКП", 5);
        s3.addGrade("БД", 4);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("\n=== Студенты ===");
        System.out.println("До обработки:");
        printStudents(students, 4);
        printStudents(students, 2);

        filterAndPromoteStudents(students);

        System.out.println("\nПосле обработки:");
        printStudents(students, 3);
        printStudents(students, 5);
    }

    public static void filterAndPromoteStudents(List<Student> students) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getAverageGrade() < 3) {
                it.remove();
            } else {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        boolean found = false;
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println("  " + s.getName());
                found = true;
            }
        }
        if (!found) System.out.println("  нет студентов");
    }
    public static void runEmployeesReport() {
        System.out.println("\n\nОТЧЁТ ПО СОТРУДНИКАМ\n");
        ArrayList<Employee> employees = new ArrayList<>();
        int id = 1;
        employees.add(new FixedSalaryEmployee("Лепешов Максим Эдуардович", id++, 60000));
        employees.add(new FixedSalaryEmployee("Радевич Роман Дмитриевич", id++, 55000));
        employees.add(new HourlyEmployee("Коваленя Роман Валерьевич", id++, 300, 160));
        employees.add(new HourlyEmployee("Новик Никита Сергеевич", id++, 350, 160));
        employees.add(new FixedSalaryEmployee("Сухой Илья Сергеевич", id++, 70000));
        employees.add(new FixedSalaryEmployee("Стельмах Константин Русланович", id++, 70000));

        generateEmployeeReport(employees);
    }

    public static void generateEmployeeReport(ArrayList<Employee> employees) {
        Collections.sort(employees.reversed());

        System.out.println("Отчет о зарплате сотрудников:");
        System.out.println("ID | ФИО                       | Среднемесячная зарплата");
        System.out.println("-".repeat(60));

        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nПервые 5 имен:");
        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            System.out.println((i + 1) + ". " + employees.get(i).getFullname());
        }

        System.out.println("\nПоследние 3 идентификатора:");
        int n = employees.size();
        for (int i = Math.max(0, n - 3); i < n; i++) {
            System.out.println("ID: " + employees.get(i).getId());
        }
    }

    public static void main(String[] args) {
        runProductsAndStudents();
        runEmployeesReport();

    }
}

