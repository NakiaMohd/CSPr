public class L5Q1
{
	public static void main(String args[])
	{
		int f=5;
		int ans=fact(f);
		System.out.println(f+"!"+" is "+ans);
	}
	public static int fact(int f)
	{
		int result=1;

		for(int x=f; x>=1;x--)
		{
			result=result*x;
		}
		return result;
	}
}
