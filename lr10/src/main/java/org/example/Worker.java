package org.example;

public abstract class Worker {
    private String FIO;
    private String dolg;
    private double oklad;
    public Worker(String FIO, String dolg, double oklad) throws OkladException
    {
        this.FIO = FIO;
        this.dolg = dolg;
        if(oklad < 0)
        {
            throw new OkladException("Оклад не может быть отрицательным");
        }
        this.oklad = oklad;
    }
    public String getFIO()
    {
        return FIO;
    }
    public void setFIO(String FIO)
    {
        this.FIO = FIO;
    }
    public String getodolg()
    {
        return dolg;
    }
    public void setdolg(String dolg)
    {
        this.dolg = dolg;
    }
    public double getoklad()
    {
        return oklad;
    }
    public void setoklad(double oklad) throws OkladException
    {
        if(oklad<0)
        {
            throw new OkladException("Оклад не может быть меньше 0");
        }
        this.oklad = oklad;
    }
    public abstract double calculatezp();
}
