public class S1L6Q3Challenge
{
	public static void main(String args[])
	{
		double r=0,r2=0;

		for(int x=1; x<=100;x++)
		{
			if(x%2==0)
			{
				r=r+x;
			}
			r2=r2+Math.pow(x,2);
		}
System.out.println("The sum of all even numbers between 2 and 100: "+r);
System.out.println("The sum of all squares between 1 and 100: "+r2);
	}
}