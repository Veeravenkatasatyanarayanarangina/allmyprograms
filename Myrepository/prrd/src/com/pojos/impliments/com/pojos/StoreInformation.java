package com.pojos.impliments.com.pojos;

import java.util.ArrayList;
import java.util.List;

public class StoreInformation
{
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        Item item = new Item("curd","groccery",45);

        list.add(new Product("q12","curd",((item.getBuyingPrice()*0.5)+ item.getBuyingPrice()), 20,item));
        for (Product p:list
             ) {
            System.out.println(p);

        }

    }
}
