/*
Write a Java program that takes a string
and ensures that it only contains lower case letters.
The program should then capitalise
the first letter of each word in the string.
*/

import java.util.*;

public class S1L8Q5
{
	public static void main(String args[])
	{
		System.out.println("Enter Something: \n");
		Scanner scan= new Scanner (System.in);

		String s1= new String (scan.nextLine());
		String s2= new String ();

		int size=s1.length();
		int a,b;

		s1=s1.toLowerCase();

		for(a=0,b=1; a<=size && b<=size; a++,b++)
		{
			s2=s1.substring(a,b);

			if(a==0)
			{
				s2=s2.toUpperCase();
			}
			if(s1.charAt(a)==' ')
			{
				s2=s1.substring(a,b+1);
				s2=s2.toUpperCase();
				a++;b++;
			}
			System.out.print(s2);
		}
	}
}