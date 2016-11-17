import java.util.*;

public class S1L9Q5
{
	public static void main(String args[])
	{
		System.out.print("Enter a size: ");
		Scanner scan=new Scanner(System.in);

		double array[]=new double [scan.nextInt()];
		System.out.println();

		int size=array.length-1;

		for(int x=0; x<=size; x++)
		{
			array[x]=scan.nextDouble();
		}
		for(int x=0; x<=size; x++)
		{
			System.out.print(array[x]+"  |  ");
		}
		double large,small;
		large=array[0];
		small=array[0];

		for(int x=0; x<=size; x++)
		{
			if (array[x]>large)
			{
				large=array[x];
			}
			else if(array[x]<small)
			{
				small=array[x];
			}
		}
		System.out.println("\nThe largest number	" + large);
		System.out.println("The smallest number	" + small);
	}
}