package org.example;
import java.util.Map;
import java.util.HashMap;
public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, int grade)
    {
        grades.put(subject, grade);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
