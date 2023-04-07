package threadintercommunication;

public class Chat {
	boolean flag = false;
	
	public synchronized void question(String msg)
	{
		if (flag) {
			try {
				wait();
				
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag =true;
		notify();
	}
	public synchronized void answer(String msg)
	{
		if(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(msg);
			flag = false;
			notify();
		}
	}

}
class T1 implements Runnable{
	 Chat m;
	   String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };
	   
	   
	   
	   public T1(Chat m)
	   {
		   this.m = m;
		   new Thread(this,"question").start();
	   }


	@Override
	public void run() {
		 for (int i = 0; i < s1.length; i++) {
	         m.question(s1[i]);
	      }
		
	}
	
}
class T2 implements Runnable {
	   Chat m;
	   String[] s2 = { "Hi", "I am good, what about you?", "Great!" };

	   public T2(Chat m2) {
	      this.m = m2;
	      new Thread(this, "answer").start();
	   }

	   public void run() {

	      for (int i = 0; i < s2.length; i++) {
	         m.answer(s2[i]);
	      }
	   }
	}
