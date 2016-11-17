public class L4Q2
{
	public static void main(String args[])
	{
		String s1="Navan";
		pali(s1);
	}
	public static void pali(String s1)
	{
		String rev=new String();

		for(int x=s1.length()-1;x>=0;x--)
		{
			rev=rev+s1.charAt(x);
		}

			if(s1.equalsIgnoreCase(rev))
			{
				System.out.println("This is a Palindrome");
			}
			else
			{
				System.out.println();
			}

	}
}