public class S1L6Q3
{
	public static void main(String args[])
	{
		double r=0,r2=0;

		for(int x=2; x<=100;x++)
		{
			if(x%2==0)
			{
				r=r+x;
			}
		}
System.out.println("The sum of all even numbers between 2 and 100: "+r);
		for(int y=1; y<=100; y++)
		{
			r2=r2+Math.pow(y,2);
		}
		System.out.println("The sum of all squares between 1 and 100: "+r2);
	}
}