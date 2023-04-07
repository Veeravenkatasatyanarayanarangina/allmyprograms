package motivity.creational.factory;

public class PassengerHome
{
    public static void main(String[] args) {
        AirlinesFactory af = new AirlinesFactory();
        Airlines a1 = af.getAirlines("Indigo");
      a1.booktickets(10);
       a1 = af.getAirlines("airindia");
       a1.booktickets(4);
    }
}
