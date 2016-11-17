import java.util.*;

public class Lab14{
	public static void main(String args[]){
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(factorial(n));
	}
	public static double factorial(int n){
		if (n==1)
		return 1;

		double value=(1.0/n);
		int x=n-1;
		return (factorial(x)/value);
	}
}