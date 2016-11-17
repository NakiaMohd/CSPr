import java.util.*;
public class L1Q1
{
	public static void main(String args[])
	{
		System.out.println("Please enter 10 integers");

		Scanner scan=new Scanner(System.in);
		int array[]=new int[10];
		int size=array.length;

	try{	for(int x=0; x<size; x++)
		{
			array[x]=scan.nextInt();
		}
	}
	catch(Exception e)
	{System.out.println("Enter only intergers!");}

	int large=0;
	large=array[0];
		for(int x=0; x<size; x++)
		{
			if(array[x]>large)
			{
				large=array[x];
			}
		}
		System.out.println("\nThe largest number is: "+large);
	}
}