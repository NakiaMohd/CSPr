import java.util.*;

public class S1L8Q1
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);

		System.out.println("Enter the first word: ");
		String s1= new String(scan.nextLine());

		System.out.println("Enter the second word: ");
		String s2= new String(scan.nextLine());

		if(s1.length()==s2.length())
		{
			System.out.println("The words are Equal length");
			int len1=0,len2=0;


for(int x=0;x<s1.length();x++)
{
	if(x%2==0)
	{
		System.out.println(s1.charAt(x));
	}
	else
	{
		System.out.println(s2.charAt(x));
	}
}
			}
		else
		{
			System.out.println("The words are not Equal");
		}
	}
}