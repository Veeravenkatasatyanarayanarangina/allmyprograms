package first;

public class Test2 extends Thread {
	@Override
	public void run() {
	
		for(int i = 0;i<5;i++)
		{
		System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		Test2 t2 = new Test2();
		t2.start();
		t2.join();

		for(int i = 0;i<5;i++)
		{
			Thread.yield();
		System.out.println(Thread.currentThread().getName()+" - "+i);
		}
		
	}

}
