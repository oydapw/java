package org.example;

public class Statworker extends Worker {
    private double bonus;
    public Statworker(String FIO, String dolg, double oklad, double bonus) throws OkladException {
        super(FIO, dolg, oklad);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculatezp() {
        try {
            if (bonus<0)
            {
                throw new PremiyaException("Премия не может быть отрицательной.");
            }
            return getoklad() + bonus;

        }
        catch (PremiyaException e)
        {
            System.err.println("Ошибка в расчете зарплаты: " + e.getMessage());
            return getoklad();
        }


    }


}
