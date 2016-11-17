public class S1L5Q4
{
	public static void main(String args[])
	{
		int x=200;

		while(x<=500)
		{
			if (x%5==0 && x%7==0)
			{
				System.out.println(x+" is a multiple of 5 and 7");
			}
			else if(x%5==0 || x%7==0)
			{
				System.out.println(x+" is a multiple of 5 or 7");
			}
			x++;
		}
	}
}