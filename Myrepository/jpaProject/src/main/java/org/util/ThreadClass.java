package org.util;

class Table
{
    synchronized void printTable(int n) throws InterruptedException {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n*i);
            Thread.sleep(600);
        }
    }
}
class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        try {
            t.printTable(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        try {
            t.printTable(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ThreadClass
{
    public static void main(String[] args)
    {
        Table obj = new Table();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();

    }
}
