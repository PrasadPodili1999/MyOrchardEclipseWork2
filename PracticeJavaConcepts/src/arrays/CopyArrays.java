package arrays;

public class CopyArrays {

	public static void main(String[] args) {
		
		int array[]= {10,12,20,30,25,40,32,31,35,50,60};	//create an array with given elements
		int array1[]=new int[6];							//create an array with size 6
		copyArrayToArray1(array,array1);
		printArray(array1);
		printArray(array);
		System.out.println("minimum element : "+findMinElement(array));
		System.out.println("maximum element : "+findMaxElement(array));

	}
	
	static void copyArrayToArray1(int []array,int []array1)		//copy required elements into resultant array
	{
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=array[3+i];
		}
	}
	
	static void printArray(int []array)				//print required array
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	static int findMinElement(int []array)			//find minimum element from input array
	{
		int minElement=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(minElement>array[i])
				minElement=array[i];
		}
		return minElement;
	}
	
	static int findMaxElement(int []array)			//find maximum element from input array
	{
		int maxElement=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(maxElement<array[i])
				maxElement=array[i];
		}
		return maxElement;
	}
}
