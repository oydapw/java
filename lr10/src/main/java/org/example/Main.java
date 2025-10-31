package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Firm firm = new Firm("моя фирма");
    Otdel otdel = new Otdel("It-отдел",1);
    try {
        Worker worker1 = new Statworker("Лепешов М.Э","Программист",-2,2500);
    }
    catch (OkladException e)
    {
        System.out.println(e.getMessage());

    }
    try
    {
        Statworker statworker1 = new Statworker("Радевич Р.Д", "Программист",-9000,2781);
    }
    catch (OkladException e)
    {
        System.out.println("Указан отрицательный оклад");

    }
    Statworker statworker2 = null;
    try
        {
             statworker2 = new Statworker("Радевич Р.Д", "Программист",2000,-781);
             statworker2.calculatezp();

        }
    catch (OkladException e)
    {
        System.out.println();
    }
    }
}