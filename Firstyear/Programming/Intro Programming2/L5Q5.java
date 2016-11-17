public class L5Q5
{
	public static void main(String args[])
	{
		double array[]={55.5,40.0,35.5,70.9};
		scaleArray(array,5.5);
	}
	public static void scaleArray(double array[],double d)
	{
		for(int x=0;x<array.length;x++)
		{
			System.out.print((array[x]/d)+"		");
		}
	}
}