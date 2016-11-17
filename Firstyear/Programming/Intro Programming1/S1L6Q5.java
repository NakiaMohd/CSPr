public class S1L6Q5
{
	public static void main(String args[])
	{
		int r1,r2,r3,r4,result = 0;
		for(int x=1000;x<10000;x++)
		{
		r1=(x/1000)%10;
		r2=(x/100)%10;
		r3=(x/10)%10;
		r4=x%10;

		if(r1==r4 && r2==r3)
		{
			System.out.println(x+" is a palindrome");
			result++;
		}
		}

        System.out.println("The number of four digit palindromic numbers: " + result);
	}
}