package motivity.creational.factory;

public class Luftansa implements Airlines{
    @Override
    public void booktickets(int tickets) {
        System.out.println("you are book "+tickets+" tickets in luftansa airlines");
    }
}
