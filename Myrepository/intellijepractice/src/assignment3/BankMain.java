package assignment3;

abstract class GenaralBank
{
    public abstract double getSavingsInterestRate(double amount);
    public abstract double getFixedDepositInterestRate(double amount);
}

class Icici extends GenaralBank
{

    @Override
    public double getSavingsInterestRate(double amount) {
        return 0.4*amount;
    }

    @Override
    public double getFixedDepositInterestRate(double amount) {
        return 0.85*amount;
    }
}
class KotMBank extends GenaralBank
{

    @Override
    public double getSavingsInterestRate(double amount) {
        return (0.6)*amount;
    }

    @Override
    public double getFixedDepositInterestRate(double amount) {
        return (0.9)*amount;
    }
}


public class BankMain
{
    public static void main(String[] args)
    {
        Icici bank = new Icici();
        System.out.println("icici savings intrest per 1000 : "+bank.getSavingsInterestRate(1000));
        System.out.println("icici FD intrest per 1000 : "+bank.getFixedDepositInterestRate(1000));

        KotMBank kom = new KotMBank();
        System.out.println("kotak bank savings intrest per 1000 : "+kom.getSavingsInterestRate(1000));
        System.out.println("kotak bank fd intrest per 1000 : "+kom.getFixedDepositInterestRate(1000));

        GenaralBank gb =new Icici();
        System.out.println("icici savings intrest per 1000 : "+gb.getSavingsInterestRate(1000));
        System.out.println("icici bank fd intrest per 1000 : "+gb.getFixedDepositInterestRate(1000));
        gb = new KotMBank();
        System.out.println("kotak bank savings intrest per 1000 : "+gb.getSavingsInterestRate(1000));
        System.out.println("kotak bank fd intrest per 1000 : "+gb.getFixedDepositInterestRate(1000));
    }
}
