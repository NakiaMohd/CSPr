import java.util.*;

public class Solution
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);

		int noOfWords=Integer.parseInt(scan.nextLine());
		String words []= new String[noOfWords];

		for (int x=0; x<noOfWords; x++)
		{
			words[x]=scan.nextLine();

		}

		String temp=new String();

			for(int x=0; x<noOfWords-1; x++)
		{
				for(int y=x+1; y<noOfWords; y++)
				{
					if(words[x].compareToIgnoreCase(words[y])>0)
						{
							temp=words[x];
							words[x]=words[y];
							words[y]=temp;
						}
				}
			}

		for (int x=0; x<noOfWords; x++)
		{
			System.out.print(words[x]+" ");
		}

	}
}