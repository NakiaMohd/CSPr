import java.util.*;

public class S1L8Q4
{
	public static void main(String args[])
	{
		System.out.println("Enter Something: ");
		Scanner scan= new Scanner(System.in);

		String s1= new String (scan.nextLine());
		int a=s1.length();

		for(int x=a-1; x>=0;x--)
		{
			if(s1.charAt(x)==' ')
			{
				System.out.println(s1.substring(x+1,a));
				a=x;
			}
			else if(x==0)
			{
				System.out.println(s1.substring(x,a));
			}
		}
	}
}