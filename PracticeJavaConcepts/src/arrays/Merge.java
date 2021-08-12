package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Merge {
	
	public static void main(String[] args) {
		
//		Integer a1[]= {1,2,3};
//		Integer a2[]= {4,5,6,7};
//		int d[]= {3,9,1,0,2,8,43,4};
//		int e[]=insertionsort(d);
//		List<Object> b=new ArrayList<Object>();
//		Stream.of(a1,a2).flatMap(Stream::of).forEach(b::add);
//		Object c[]=b.toArray();
////		for(int i=0;i<c.length;i++)
////		{
////			
////					System.out.println(c[i]+" ");
////		}
//		System.out.println(Arrays.toString(c));
//		System.out.println(Arrays.toString(e));
		int a1[]= {1,2,3};
		int a2[]= {4,5,6,7};
		int len=a1.length+a2.length;
		int a3[]=new int[len];
		int k=0;
		for(int i=0;i<a1.length;i++)
		{
			a3[k]=a1[i];
			k++;
		}
		for(int i=0;i<a2.length;i++)
		{
			a3[k]=a2[i];
			k++;
		}
		for(int i=0;i<a3.length;i++)
		{
			
					System.out.print(a3[i]+" ");
		}
	}
	public static int [] insertionsort(int a[])
	{
		int j=0;
		for(int i=1;i<a.length;i++)
		{
			int min=a[i];
			for(j=i-1;j>=0&&a[j]>min;j--)
			{
				a[j+1]=a[j];
			}
			a[j+1]=min;
		}
		return a;
	}
}
