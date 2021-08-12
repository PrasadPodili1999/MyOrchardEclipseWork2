package synchronization;

class A
{
	public void d1(B b)
	{
		System.out.println("thread1 is calling d1()");
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("thread1 trying to call B's last()");
		b.last();
	}
	public void last()
	{
		System.out.println("inside A, last()");
	}
}
class B
{
	public void d2(A a)
	{
		System.out.println("thread2 is calling d2()");
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("thread2 is trying to call A's last()");
		a.last();
	}
	public void last()
	{
		System.out.println("inside B, last()");
	}
}
public class DeadLock extends Thread{

	A a=new A();
	B b=new B();
	public  void m1()
	{
		a.d1(b); 			//called by main thread
		this.start();		//internally child thread created and calls run()
	}
	public void run()
	{
		b.d2(a);			//called by child thread
	}
	
	public static void main(String[] args) {
		
		DeadLock t1=new DeadLock();
		t1.m1();
	}
}
