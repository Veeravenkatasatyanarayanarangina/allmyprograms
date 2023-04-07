package com.motivity.factorypattern;

import java.net.SocketTimeoutException;

abstract public class TrainTicketsPrice {
    protected double price;
    abstract void getPrice();

    public void totalPrice(int no_of_passengers)
    {
        System.out.println("each ticket price :"+this.price);
        System.out.println("total price for all tickets : "+ no_of_passengers*this.price);
    }

}
