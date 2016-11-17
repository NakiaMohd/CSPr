public class L3Q4
{
	public static void main(String args[])
	{
		size(34.7,98.5);
	}
	public static void size(double a,double b)
	{
		if(a>b)
		{
			System.out.println(a+" is the largest");
			System.out.println(b+" is the smallest");
		}
		else if(a<b)
		{
			System.out.println(b+" is the largest");
			System.out.println(a+" is the smallest");
		}
		else
		{
			System.out.println(a+" and "+b+"are equal");
		}
	}
}