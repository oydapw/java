package org.example;

public class ContractWorker extends Worker{
    public ContractWorker(String FIO, String dolg, double oklad) throws OkladException
    {
        super(FIO, dolg, oklad);
    }
    @Override
    public double calculatezp()
    {
        try {
            return getoklad();
        }
        catch (Exception e)
        {
            System.out.println("Ошибка при расчете зарплаты контрактника: " + e.getMessage());
            return 0;
        }
    }

}
