package threadfiles;

public class Threadclass  implements Runnable
{
    public static void main(String[] args) {
        Threadclass e = new Threadclass();
        Thread thread = new Thread(e);
        thread.start();
        Thread thread1 = new Thread(e,"satya");
        thread1.setPriority(7);
        thread1.start();


    }

    @Override
    public void run()  {
        for (int i =1;i<5;i++) {
            System.out.println(Thread.currentThread()+" loop "+i);
        }

    }
}
