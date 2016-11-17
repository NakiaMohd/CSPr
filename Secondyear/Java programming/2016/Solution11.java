import java.util.*;

public class Solution11
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);

		System.out.print("Input first base: ");
		int fBase=scan.nextInt();

		System.out.print("\nInput second base: ");
		int sBase=scan.nextInt();

		System.out.print("\nInput number: ");
		int number=scan.nextInt();

		int converted=0;
		int power=0;
		int remainder=0;

       while (number>0)
       {
       		converted+=(number%10) * Math.pow(fBase,power);
       		power++;
       		number = (number-(number%10))/10;
       }
       number = converted;
       converted=0;
       power=0;

       while(number>0)
       {
       		remainder = number%sBase;
       		converted+= remainder*Math.pow(10,power);
       		number=(number-remainder)/sBase;
       		power++;
       }
       System.out.println(converted);
	}
}
