import java.util.*;

public class S1L8Q2
{
	public static void main(String args[])
	{
		System.out.println("Please Enter Sentence: ");
		Scanner scan=new Scanner(System.in);
		String s1= new String(scan.nextLine());

		int counter=0;
		int size=s1.length()-1;

		for(int x=0; x<size; x++)
		{
			if(s1.charAt(x)=='a')
			{
				counter++;
			}
		}

		if(counter<3)
		{
			s1=s1.replace('a','%');
			System.out.println(s1);
		}
		else
		{
			s1=s1.replace('a','*');
			System.out.println(s1);
		}
	}
}