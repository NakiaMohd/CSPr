public class S1L4Q4
{
	public static void main(String args[])
	{
		int num=987, r1,r2,r3,r4;

		if (num<100|num>10000)
		{
			System.out.println("This is a either more then 3 digit or less than number");

		}
		else if (num>99&&num<1000)
		{
			System.out.println("This number is 3 digits ");
			r1=(num/100)%10;
			r2=(num/10)%10;
			r3=num%10;
			System.out.println(r1+"\n"+r2+"\n"+r3);
		}
		else
		{
			System.out.println("This is  four digit number ");
			r1=(num/1000)%10;
			r2=(num/100)%10;
			r3=(num/10)%10;
			r4=num%10;
			System.out.println(r1+"\n"+r2+"\n"+r3+"\n"+r4);
		}

	}
}