import java.util.*;

public class S1L9Q3
{
	public static void main(String args[])
	{
		System.out.println("Enter something: ");

		Scanner scan=new Scanner(System.in);

		String s1=new String(scan.nextLine());

		for (int a=0; a<s1.length();a++)
		{
			for(int b=s1.length()-1; b>0; b--)
			{
				if(s1.charAt(a)==(s1.charAt(b)))
				{
					System.out.println("palindrome");
				}
			}
		}
	}
}