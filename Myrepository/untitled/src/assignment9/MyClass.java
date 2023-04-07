package assignment9;

public class MyClass extends Thread
{
    int count = 0;

    public void counting()
    {
        count++;
    }

    public void run()
    {
        counting();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.start();
        System.out.println(myClass.count);
        for (int i = 0; i < 10000; ++i) {
            myClass.counting();}
            for (int j = 0; j < 10000; ++j) {
                myClass.counting();
            }


        }

}
