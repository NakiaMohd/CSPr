import java.util.*;
public class PQ
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

			int count = 0;

			for(int i = 2; i <x; i++)
			{
				if(x%i == 0)
				{
					count++;
				}

			}

			if(count==0)
				{
					System.out.println("TRUE");
				}
			else if(count != 0)
				{
					System.out.println("FALSE");
				}
	}
}
