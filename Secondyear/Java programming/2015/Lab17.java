import java.util.*;
public class Lab17{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		long x= scan.nextLong();
		long y=scan.nextLong();
		System.out.println(GCD(x,y));
	}
	public static long GCD(long x, long y)
	{
		if(x==0)
			return y;

		if(y==0)
			return x;

		long one=y;
		long two=x%y;

		return(GCD(one,two));
	}
}