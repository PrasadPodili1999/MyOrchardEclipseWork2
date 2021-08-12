package nestedclasses;

class SuperClass
{
	public void test()
	{
		System.out.println("this is test() of superclass!!");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		
		SuperClass ref1=new SuperClass()
				{
					int s=23;
					@Override
					public void test()
					{
						System.out.println("this is anonymous class implementation!!!");
					}
				};
				ref1.test();
				
				
	}

}
