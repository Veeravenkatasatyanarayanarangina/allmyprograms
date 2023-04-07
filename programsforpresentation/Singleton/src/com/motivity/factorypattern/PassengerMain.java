package com.motivity.factorypattern;

import java.io.IOException;
import java.util.Scanner;

public class PassengerMain
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        TrainObjectFactoryClass factoryClass = new TrainObjectFactoryClass();
        System.out.println("enter your prefer class for journy ");
        String s =sc.next();
        System.out.println("how many tickets you want....");
        int count = sc.nextInt();

        TrainTicketsPrice tp  = factoryClass.getTrainTicketsPrice(s);
        tp.getPrice();
        tp.totalPrice(count);

    }

}
