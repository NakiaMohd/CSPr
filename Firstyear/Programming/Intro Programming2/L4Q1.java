public class L4Q1
{
	public static void main(String args[])
	{
		String s1="Naqiyya";
		detectDuplicateLetter(s1);
	}
	public static void detectDuplicateLetter(String s1)
	{
		for(int x=0; x<s1.length()-1;x++)
		{
			if(s1.charAt(x)==s1.charAt(x+1))
			{
				System.out.println("Duplicate letter found");
				System.out.println(s1+" has the duplicate letter of "+s1.charAt(x));
			}
		}
	}
}