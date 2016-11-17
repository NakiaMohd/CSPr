public class L3Q6
{
	public static void main(String args[])
	{
		int array[][]=new int[10][10];

		for(int x=0;x<array.length;x++)
		{
			for(int y=0;y<array[x].length;y++)
			{
				array[x][y]=x*y;
			}
		}
int hold=0;

		for(int x=0;x<array.length;x++)
		{
			for(int y=0;y<array[x].length;y++)
			{
				if(x==0|y==0)
				{
					array[x][y]=hold;
					hold++;

					if(hold==10)
					{
						hold=1;
					}
				}

			System.out.print(array[x][y]+"	");
				if(y==0)
				{
					System.out.print("|");
				}
			}
			System.out.println();
				if(x==0)
				{
					System.out.println("_______________________________________");
				}
		}
	}
}