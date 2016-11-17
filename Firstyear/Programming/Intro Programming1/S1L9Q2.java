import java.util.*;

public class S1L9Q2
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter 2 numbers: ");

		int a=scan.nextInt();
		int b=scan.nextInt();

		double r=Math.pow(a,b);

		System.out.println(r);

	}
}