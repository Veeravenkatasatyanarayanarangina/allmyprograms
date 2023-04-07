package com.mediator;

import javax.jws.soap.SOAPBinding;

public class Whatsapp
{
    public static void main(String[] args) {
        User satya = new User("satya");
        User burkha = new User("burkha");
        satya.sendMessage("hi!burkha");
        burkha.sendMessage("hello satya");
    }
}
