import java.util.*;

public class Solution5
{
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		int size = Integer.parseInt(scan.nextLine());
		int array[]=new int [size];
		int temp=0;

		for(int x=0; x<size;  x++)
		{
			array[x]=scan.nextInt();
		}
		System.out.println();

  	for(int x=0; x<size; x++)
		{
			for (int y=0; y<size-1; y++)
			{
				if(array[y]>array[y+1])
				{
				temp=array[y];
				array[y]=array[y+1];
				array[y+1]=temp;
					}
			}
		}

		for(int x=0; x<size; x++)
		{
			System.out.print(array[x]+" ");
		}

System.out.println();
		double med=0;
		double sum=0;

		if(size%2==0)//even
		{
			med=size/2;
			Math.round(med);
			int medeven= (int) med;
			sum=(array[medeven-1]+array[medeven])/2;
			System.out.println(sum);

		}
		else if(size%2==1)//odd
		{
			med=size/2;
			Math.round(med);
			int medeven= (int) med;
			sum=array[medeven];
			System.out.println(sum);
		}

	}

}