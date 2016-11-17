public class L2Q5
{
	public static void main(String args[])
	{
		int array[][]=new int [4][5];
		int size=array.length;

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j]=42;
			}
		}

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}