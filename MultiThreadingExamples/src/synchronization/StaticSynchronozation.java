package synchronization;

class Table1
{
	static synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class StaticSynchronozation {

	public static void main(String[] args) {
		
		Runnable r1=()->{
			Table1.printTable(5);
		};
		Runnable r2=()->{
			Table1.printTable(3);
		};
		Runnable r3=()->{
			Table1.printTable(10);
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
	}

}
