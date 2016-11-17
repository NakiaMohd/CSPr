import java.util.*;
public class S1L10Q4
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner (System.in);
		int num=scan.nextInt();

		if(num%2==0)
		{
			System.out.println(num+" is an EVEN number.");
		}
		else
		{
			System.out.println(num+ " is an ODD number.");
		}

		int result=0;

		for (int y=2; y<num; y++)
		{
			if(num%y==0)
			{
				result++;
			}
		}

			if(result==0)
				{
					System.out.println(num+ " is Prime");
				}
			else if(result != 0)
				{
					System.out.println(num+" is not Prime");
				}
	}
}