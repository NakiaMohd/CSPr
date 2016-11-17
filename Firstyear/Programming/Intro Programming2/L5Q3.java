public class L5Q3
{
	public static void main(String args[])
	{
		int numList[]={0,1,2,3,4,5,6,7};
		oddEven(numList);


	}
	public static void ven(int numList[])
	{
		int size=numList.length;

		for(int x=0;x<size;x++)
		{
			if(x%2==1)
			{
				numList[x]=-1;
			}
		}

	for(int x=0;x<size;x++)
		{
			System.out.print(numList[x]+"   ");
		}
	}
}