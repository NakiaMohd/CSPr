import java.util.*;
public class Lab20{
	public static void mian(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int output = scan.nextInt();
		int num = scan.nextInt();
		int value=0;
		int power=0;

		while(num>0){
			value+=(num%10)*Math.pow(input,power);
			power++;
			num=(num-(num%10))/10;
		}

		String solution=new String();

		while(value>0){
			solution=(value%output)+solution;
			value=(value-(value%output))/output;
		}
		System.out.println(solution);
	}
}