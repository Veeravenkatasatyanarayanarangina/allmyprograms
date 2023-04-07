package com.iteratorpattern;

public class IteratorMain
{
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for(Iterator iterator = nameRepository.getIterator(); iterator.hasNext();)
        {
            System.out.println((String) iterator.next());
        }
    }
}
