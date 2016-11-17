public class L3Q5
{
	public static void main(String args[])
	{
		char array[][]=new char [7][];

		array[0]=new char[1];
		array[1]=new char[2];
		array[2]=new char[3];
		array[3]=new char[4];
		array[4]=new char[3];
		array[5]=new char[2];
		array[6]=new char[1];

	for(int x=0; x<array.length; x++)
		{
			for(int y=0;y<array[x].length;y++)
			{
				array[x][y]='+';
				System.out.print(array[x][y]+"  ");
			}
		System.out.println();
		}
	}
}