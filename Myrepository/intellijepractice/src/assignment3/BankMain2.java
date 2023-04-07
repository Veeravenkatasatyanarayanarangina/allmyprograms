package assignment3;

public class BankMain2
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
