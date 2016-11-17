import java.util.*;

public class Lab26 {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int array[] = new int[input];

		for(int x=input-1; x>-1; x--)
			{
			array[x]=scan.nextInt();
			}

		int temp=0;
		for(int x = 0 ; x < array.length; x++)
		{
			for(int y = 0; y < array.length-1; y++)
			{
				if(array[y] < array [y+1])
				{
					temp = array[y];
					array[y] = array[y+1];
					array[y+1] = temp;
				}
			}
		}

	if (input==1)
	{
		System.out.println(array[0]);
	}
	else
	{
		int nth=scan.nextInt();
		System.out.println(array[nth-1]);
	}
    }
}