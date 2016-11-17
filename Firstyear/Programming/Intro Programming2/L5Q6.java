public class L5Q6
{
	public static void main(String args[])
	{
		String s1="Naqiyya";
		Vowel(s1);
	}
	public static void Vowel(String s1)
	{
		int a,e,i,o,u,constant;
		a=0;
		e=0;
		i=0;
		o=0;
		u=0;
		constant=0;
		for(int x=0; x<s1.length();x++)
		{
		if (s1.charAt(x)=='a')
		{
			a++;
		}
		else if(s1.charAt(x)=='e')
		{
			e++;
		}
		else if(s1.charAt(x)=='i')
		{
			i++;
		}
		else if(s1.charAt(x)=='o')
		{
			o++;
		}
		else if(s1.charAt(x)=='u')
		{
			e++;
		}
		else
		{
			constant++;
		}

		}
		System.out.println("The number of Vowels are "+(a+e+i+o+u)+", also the number of non-vowels are "+constant);
	}
}