import java.util.*;
public class L4Q3
{
	static int array[]=new int[100];

	public static void main(String args[])
	{
		makeIntArray(array);
		printArray(array);

		int array1[]=new int[] {12,56,865,89,23};
		int array2[]=new int []{45,21,45,567,67};

		dotProduct(array1,array2);
		findMax(array1);
		findMax2(array);
	}
	public static void makeIntArray(int array[])
	{
		Random rn =new Random();

		for (int x=0; x<array.length;x++)
		{
			array[x]=rn.nextInt(200);
		}
	}
	public static void printArray(int array[])
	{
		for (int x=0; x<array.length;x++)
		{
			System.out.print(array[x]+"	");
		}
		System.out.println("\n");
	}
	public static void dotProduct(int array1[],int array2[])
	{
int result=0;
		for (int x=0; x<array1.length;x++)
		{
			result=result+(array1[x]*array2[x]);
		}System.out.print('\n');
		System.out.println("The dot product is "+result);
	}
	public static void findMax(int array1[])
	{
		int largest=array1[0];

		for(int x=0;x<array1.length;x++)
		{
			if(array1[x]>largest)
			{
				largest=array1[x];
			}
		}
		System.out.println("The largest value is "+largest);
	}
		public static void findMax2(int array[])
	{
		int largest=array[0];

		for(int x=0;x<array.length;x++)
		{
			largest=array[0];
			if(array[x]>largest)
			{
				largest=array[x];
			}
		}
		System.out.println("The largest static value is "+largest);
	}
}