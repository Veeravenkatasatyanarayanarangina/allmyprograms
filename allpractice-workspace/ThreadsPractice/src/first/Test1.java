package first;

import java.time.LocalDate;

public class Test1 extends Thread
{
	@Override
	public void run() {

           System.out.println(Thread.currentThread().isInterrupted());
          System.out.println(Thread.interrupted());
          Thread.currentThread().interrupt();
            try
            {
            for(int i = 0;i<=10;i++)
            {
                System.out.println("Test1 class......");
                 Thread.sleep(1000);
            }
               
            }
            catch(InterruptedException e)
            {
               e.printStackTrace();
            }
	}
	
	

	
//	public static void main(String[] args) throws InterruptedException {
//		
//		
//		Thread t1 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("daemon thread");
//				
//			}
//		});
//	
//		t1.setDaemon(true);
//		t1.start();
//		t1.join();
//		System.out.println("main thread");
//		Thread.currentThread().sleep(300);
//		
//		System.out.println(Thread.currentThread().isAlive());
//		System.out.println(Thread.currentThread().isDaemon());
//		
//		
//	}

}
