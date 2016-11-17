import java.util.*;
public class L2Q2
{
	public static void main(String args[])
	{
		System.out.println("Enter a sentence please: ");

		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		int size=input.length();
		int a,e,i,o,u;
		a=0;	e=0;	i=0;	o=0;	u=0;
		for(int x=0;x<size;x++)
		{
			if(input.charAt(x)=='a')
			{
				a++;
			}
			else if(input.charAt(x)=='e')
			{
				e++;
			}
			else if(input.charAt(x)=='i')
			{
				i++;
			}
			else if(input.charAt(x)=='o')
			{
				o++;
			}
			else if(input.charAt(x)=='u')
			{
				u++;
			}

		}
		System.out.println("The amount of a's in "+input+" is "+a);
		System.out.println("The amount of e's in "+input+" is "+e);
		System.out.println("The amount of i's in "+input+" is "+i);
		System.out.println("The amount of o's in "+input+" is "+o);
		System.out.println("The amount of u's in "+input+" is "+u);
	}
}