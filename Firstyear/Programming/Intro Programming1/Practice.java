import java.util.*;
public class Practice
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		int array []= new int [10];

		int size=array.length-1;
		Random ran=new Random();
		int average=0,sum=0;

		for(int x=0; x<=size; x++)
		{
			array[x]=ran.nextInt(1000);
			System.out.print(array[x]+" - ");
		}
		for(int x=0; x<=size; x++)
		{
			sum=sum+array[x];
			average=sum/size;
		}

		System.out.println("\nThe average is "+average);
	}
}