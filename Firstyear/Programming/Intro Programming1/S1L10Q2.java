import java.util.*;

public class S1L10Q2
{
	public static void main(String args[])
	{
		System.out.println("Enter your age: ");
		Scanner scan= new Scanner(System.in);
		int age=scan.nextInt();

		if(age>=65 && age<12)
		{
			System.out.println("Free");
		}
		else
		{
			System.out.println("€15.00");
		}
	}
}