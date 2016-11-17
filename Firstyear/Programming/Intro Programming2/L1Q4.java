import java.util.*;

public class L1Q4
{
	final static int MAX=10;
	public static void main(String args[])
		{
			Random rn= new Random();
			int array[]= new int[MAX];
			boolean found=false; String userInput=null;
			int temp=0;

			for(int x=0; x<MAX; x++)
			{
				array[x]=1+rn.nextInt(50);
			}

			for(int pass=1; pass<MAX; pass++)
			{
				for(int x=0; x<MAX-1; x++)
				{
					if(array[x]>array[x+1])
					{
						temp=array[x];
						array[x]=array[x+1];
						array[x+1]=temp;
					}
				}
			}
			for(int x=0; x<MAX; x++)
			{
				System.out.print(array[x]+" ¦ ");
			}
			System.out.println("*****************\n");

			int high,low,middle;
			high=MAX-1;
			low=0;
			middle=0;

			System.out.println("Pick a number BUT don't tell me!!");
			Scanner scan= new Scanner(System.in);

			while(low<=high && !found)
			{
				middle=(high+low)/2;
				System.out.println("Computer guesses :"+ array[middle]);
				userInput=scan.nextLine();

				if(userInput.equalsIgnoreCase("higher"))
				{
					low=middle+1;
				}
				else if(userInput.equalsIgnoreCase("lower"))
				{
					high=middle-1;
				}
				else if(userInput.equalsIgnoreCase("correct"))
				{
					System.out.println("Your number is: "+ array[middle]);
					found=true;
				}
				else
				{
					System.out.println("Invalid input");
				}
			}
		}
}