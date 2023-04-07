package com.motivity.factorypattern;

public class SecondClass extends TrainTicketsPrice
{
    @Override
    void getPrice()
    {
        super.price = 850.00;
    }
}
