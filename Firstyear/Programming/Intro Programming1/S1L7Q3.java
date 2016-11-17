public class S1L7Q3
{
	public static void main(String args[])
	{
		for(int x=0;x<=12;x++)
		{
			System.out.println(x+" times table:");
			System.out.println("******************");
			int result=0;
			for(int y=0;y<=12;y++)
			{
				result=x*y;
				System.out.println(x+" * "+y+" = "+result);
			}
			System.out.println("");

		}
	}
}