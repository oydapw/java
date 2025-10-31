package org.example;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void z1() {
        String fileName = "me.txt";
        try(PrintWriter writer = new PrintWriter(fileName)) {

            writer.println("Максим, 19 , студент");
            System.out.println("Файл создан: " + fileName);

        }catch (IOException e)
        {
            System.out.println("Ошибка создания файла!");
            return;
        }
        File file = new File(fileName);
        System.out.println("Имя: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Путь: " + file.getAbsolutePath());
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла!");
        }
    }
    public static void z2()
    {
        String fileName = "tempa.txt";
        Scanner scanner = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(fileName)) {
            System.out.println("Введите 15 значений температуры (через Enter):");
            for (int i = 1; i <= 15; i++) {
                System.out.print("Температура " + i + ": ");
                double temp = scanner.nextDouble();
                writer.println(temp);
            }
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: не удалось создать файл!");
            return;
        } catch (Exception e) {
            System.out.println("Ошибка ввода! Вводите только числа.");
            return;
        }
        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    double temp = Double.parseDouble(line.trim());
                    sum += temp;
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла!");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: в файле некорректные данные!");
            return;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("\nСредняя температура за 15 измерений: %.2f °C\n", average);
        } else {
            System.out.println("Нет данных для расчёта.");
        }
    }
    public static void z3v14()
    {
        String fileName = "nums.txt";
        Random random = new Random();
        int count = 10;
        try (PrintWriter writer = new PrintWriter(fileName)) {
            System.out.println("Генерация " + count + " случайных чисел и запись в файл...");
            for (int i = 0; i < count; i++) {
                int num = random.nextInt(201) - 100;
                writer.println(num);
            }
            System.out.println("Числа записаны в файл: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: не удалось создать файл!");
            return;
        }
        int sum = 0;
        int readCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    try {
                        int num = Integer.parseInt(line.trim());
                        sum += num;
                        readCount++;
                    } catch (NumberFormatException e) {
                        System.out.println("Предупреждение: строка '" + line + "' не является числом — пропущена.");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден!");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла!");
            return;
        }

        if (readCount > 0) {
            System.out.printf("Сумма %d чисел: %d\n", readCount, sum);
        } else {
            System.out.println("Нет валидных чисел для подсчёта.");
        }
    }


    public static void main(String[] args) {
            z1();
            z2();
            z3v14();
    }
}
