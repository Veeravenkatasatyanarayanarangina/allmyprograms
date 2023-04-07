package motivity.creational.factory;

public class Indigo implements Airlines{
    @Override
    public void booktickets(int tickets) {
        System.out.println("you are book "+tickets+" tickets in indigo airlines");

    }
}
