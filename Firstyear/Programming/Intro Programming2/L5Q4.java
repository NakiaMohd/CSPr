public class L5Q4
{
	public static void main(String args[])
	{
		int [][] numberGrid ={ {2,4,6},{1,5,7},{14,2,9} };
		multiply(numberGrid);
	}
	public static void multiply(int [][] numberGrid)
	{
		for(int i=0;i<numberGrid.length;i++)
		{
			for(int j=0;j<numberGrid[i].length;j++)
			{
				System.out.print(numberGrid[i][j]*5+"	");
			}
			System.out.println();
		}
}
}