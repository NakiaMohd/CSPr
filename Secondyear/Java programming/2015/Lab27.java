import java.util.*;

public class Lab27 {
public static void main(String args[] ) throws Exception {
	Scanner scan = new Scanner(System.in);

	int input = scan.nextInt();

	int array[] = new int[input];

	for(int x=0; x<input; x++)
	{
		array[x]=scan.nextInt();
	}
		Arrays.sort(array);
		int a=input/2;

		double med2=0;


	if(input%2==0)
	{
double med=(((double)array[a-1])+((double)array[a]))/2;
		System.out.println(med);
	}
	else if (input==1)
	{
		System.out.println(med2=(double)array[0]);
	}

	else
	{
		System.out.println(med2=(double)array[a]);
	}
	}
}