public class S1L4Q3
{
	public static void main(String args[])
	{
		int Laila,Adam,Aoife;
		Laila=3;
		Adam=8;
		Aoife=7;

		if (Laila>18 && Adam>18 && Aoife>18)
		{
			System.out.println("All people are over 18");
		}
		else
		{
			System.out.println("Not all people are over 18");
		}

		if (Laila>18 | Adam>18 | Aoife>18)
		{
			System.out.println("At least one of the people are over 18");
		}
		else
		{
			System.out.println("None one of the people are over 18.");
		}
	}
}