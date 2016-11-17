public class S1L4Q2
{
	public static void main(String args[])
	{

	double x,y,result;
		x=5.3;
		y=4.8;
		result=0.0;

		char z='%';

		if (z=='+')
		{
			result=x+y;
		}
		else if (z=='-')
		{
			result=x-y;
		}
		else if (z=='*')
		{
			result=x*y;
		}
		else if (z=='/')
		{
			result=x/y;
		}
		else
		{
			result=x%y;
		}
		System.out.println(result);
	}
}