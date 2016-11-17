import java.util.*;

public class Lab9{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		Random ran = new Random();

		int rolls=6;//amount of die rolls to get 6
	//	int die[]=new int[] {1,2,3,4,5,6};
	int die=ran.nextInt(6)+1;

		double choice=0;

			for(int i=0; i<6; i++){
				choice+=(1-dice(rolls));
			}

		System.out.println(String.format("%.3f",choice));
	}
	public static double dice(int n)
	{
		 if (n<2)
		 	return 1;

        if (n==2)
            return (5/6)/6;

        int x = n-1;

        double value = (6-x)/6.0;

        return (value*dice(x));
	}
}
