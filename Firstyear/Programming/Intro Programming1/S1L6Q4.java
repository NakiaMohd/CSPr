public class S1L6Q4
{
	public static void main(String args[])
	{
		int x=245,r1,r2,r3;
		r1=r2=r3=0;

		r1=(x/100)%10;
		r2=(x/10)%10;
		r3=x%10;

		System.out.println("The first digit in the number "+x+" is 	"+r1);
		System.out.println("******************************************");
		System.out.println("The second digit in the number "+x+" is 	"+r2);
		System.out.println("******************************************");
		System.out.println("The third digit in the number "+x+" is 	"+r3);
		System.out.println("******************************************");
	}
}