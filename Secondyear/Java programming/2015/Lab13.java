import java.util.*;

public class Lab13{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(String.format("%.3f",(1-birthday(n))));
	}
	public static double birthday(int n)
	{
		 if (n<2)
		 	return 1;

        if (n==2)
            return 364.0/365.0;

        int x = n-1;

        double value = (365-x)/365.0;

        return (value*birthday(x));
	}
}
