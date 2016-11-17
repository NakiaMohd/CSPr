public class L5Q2
{
	public static void main(String arg[])
	{
		double[] numList = {11.0, 223.4, 234.55, 7.87};

		double small=smallest(numList);
		System.out.print("The smallest value is "+small);
	}
	public static double smallest(double[] numList)
	{
		double small=numList[0];

		for(int x=0;x<numList.length;x++)
		{
			if(numList[x]<small)
			{
				small=numList[x];
			}
		}
		return small;
	}
}