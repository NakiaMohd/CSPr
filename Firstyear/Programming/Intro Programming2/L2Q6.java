public class L2Q6
{
	public static void main(String args[])
	{
		char array[][]=new char[4][12];
		int size=array.length;

		for(int x=0; x<size;x++)
		{
			for(int y=0;y<array[x].length;y++)
			{
					array[x][y]='*';
			}
		}

	for(int x=0; x<size;x++)
		{
			for(int y=0;y<array[x].length;y++)
			{
				System.out.print(array[x][y]+"  ");
			}
			System.out.println();
		}
	}
}