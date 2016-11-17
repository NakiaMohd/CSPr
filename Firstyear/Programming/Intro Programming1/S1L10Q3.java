import java.util.*;

public class S1L10Q3
{
	public static void main(String args[])
	{
		double T, pie, l,g;
		Scanner scan= new Scanner (System.in);

		g=9.8;
		pie=3.14;
		T=0.0;
		System.out.print("Add value of l: ");
		l=scan.nextDouble();

		T=2*pie*Math.sqrt(l/g);
		System.out.println(T);
	}
}