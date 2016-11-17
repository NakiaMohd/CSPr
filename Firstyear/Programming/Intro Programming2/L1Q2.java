public class L1Q2
{
	public static void main(String args[])
	{
		float array[]={10.0f,9.0f,8.0f,7.0f};
		int pass=0,comp=0,swaps=0;

		int size=array.length;
		float temp=0.0f;

		for(int x=0; x<size; x++)
		{
			System.out.print(array[x]+" ");

				for(int y=0; y<size-1; y++)
				{
					if(array[y]>array[y+1])
						{
							temp=array[y];
							array[y]=array[y+1];
							array[y+1]=temp;

							//System.out.print(temp+" ");
							swaps++;
						}
				//System.out.print(array[y]+" ");
							comp++;
				}
							pass++;
			}

		System.out.println("\nThe number of Passes: "+pass);
		System.out.println("The number of Comparisons: "+comp);
		System.out.println("The number of Swaps: "+swaps);
System.out.println();
		for(int i=0;i<size; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}