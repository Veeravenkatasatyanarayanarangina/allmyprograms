package motivity.creational.factory;

public class AirlinesFactory
{
    public Airlines getAirlines(String airlines)
    {
       switch (airlines)
       {
           case ("AirIndia"): return new AirIndia();
           case ("Indigo"): return new Indigo();
           case ("Luftansa"): return new Luftansa();
           default:return new Invalid();
       }
    }
}
