public class S1L2Q5
{
	public static void main(String args[])
	{
		int a,b;
		a=12;
		b=10;

		double c,d;
		c=12.0;
		d=10.0;

		int r1=a%b, r3=b%a;
		double r2= c%d, r4=d%c, r5=c%b;


		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}
}