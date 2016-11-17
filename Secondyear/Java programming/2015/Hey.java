public class Hey{
	public static void main(String args[])
	{
		int i=0, j=2;
		while(i<10)
		{
			j=3;
			while(j>i)
			{
				System.out.println("Inner");
				j--;
			}
			System.out.println("out");
			i--;
		}
	}
}