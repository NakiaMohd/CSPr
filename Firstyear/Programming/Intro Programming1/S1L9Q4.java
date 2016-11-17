import java.util.*;

public class S1L9Q4
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner (System.in);
		System.out.print("Enter a size: ");

		int array[]=new int[scan.nextInt()];
		Random ran= new Random();

		int size=array.length-1;

		int ranInt;
		int sum=0, average=0;

		for(int x=0; x<=size; x++)
			{
				ranInt = ran.nextInt(1000);
				array[x]=ranInt;

				System.out.print(array[x]+" | ");
			}
		for(int x=0; x<=size; x++)
		{
			sum=sum+array[x];
			average=sum/size;

		}
			System.out.println("\nThe average of the array: "+average);
	}
}