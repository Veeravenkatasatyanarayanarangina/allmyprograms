package motivity.creational.factory;

public class AirIndia implements Airlines {

    @Override
    public void booktickets(int tickets) {
        System.out.println("you are book "+tickets+" tickets in air-india airlines");
    }
}
