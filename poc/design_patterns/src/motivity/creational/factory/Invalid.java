package motivity.creational.factory;

public class Invalid implements Airlines{
    @Override
    public void booktickets(int tickets) {
        System.out.println("you choose an invalid option please verify it");
    }
}
