import java.util.*;

public class S1L8Q3
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter Something: \n");

		String s1= new String (scan.nextLine());

		int s=s1.length();

		for(int x=s-1;x>=0;x--)
		{
			if(s1.charAt(x)==' ')
			{
				System.out.println();
			}
			else
			{
				System.out.print(s1.charAt(x));
			}
		}
	}
}

