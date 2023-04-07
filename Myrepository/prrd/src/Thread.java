public class Thread extends java.lang.Thread {

    @Override
    public void run() {
        try
        {
            java.lang.Thread.sleep(500);
            System.out.println("current Thread is"+ java.lang.Thread.currentThread().isAlive());

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread();
        System.out.println("before starting thread is alive :"+t1.isAlive());
        t1.start();
        System.out.println("after +"+t1.isAlive());


    }
}
