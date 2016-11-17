public class S1L5Q3
{
	public static void main(String args[])
	{
	int x=1,r=0;

	while(x<=50)
	{
		if(x%2==1)
		{
			r=r+x;
		}
		x++;
	}
	System.out.println("The sum of the odd numbers from 0 to 50 inclusive is: "+r);
	}
}