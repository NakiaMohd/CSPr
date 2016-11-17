public class S1L7Q6
{
	public static void main(String args[])
	{
		int x=1, r=1;
		for(int h=1; h<=200; h++)
		{
			for(int a=1; a<=200; a++)
			{
				for(int o=1; o<=200; o++)
				{
					if(Math.pow(a,2)+Math.pow(o,2)==Math.pow(h,2))
					{

						if(a==o+r)
						{
							r=r+x;

						}
						else
						{
							System.out.println(a+"+"+o+"="+h);
						}
						x++;
					}
				}

			}
		}
	}
}