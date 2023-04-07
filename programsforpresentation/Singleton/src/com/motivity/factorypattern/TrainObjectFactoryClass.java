package com.motivity.factorypattern;

public class TrainObjectFactoryClass
{
    public TrainTicketsPrice getTrainTicketsPrice(String compartment)
    {
        if(compartment ==null)
        {
            return null;
        }
        if(compartment.equalsIgnoreCase("firstclass"))
        {
            return new FirstClass();
        }
        else if(compartment.equalsIgnoreCase("secondclass"))
        {
            return new SecondClass();
        }
        else if(compartment.equalsIgnoreCase("genaralclass"))
        {
            return new GeneralCLass();
        }
        return null;
    }

}
