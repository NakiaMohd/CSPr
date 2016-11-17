import java.util.*;
public class Lab16{
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);
		String palindrome = scan.nextLine();
		System.out.println(check(palindrome));
	}
	public static String check (String pali){
		if(pali.length()<2)
			return "TRUE";

		if(pali.charAt(0)!=pali.charAt(pali.length()-1))
			return "FALSE";

			//
		String substring=pali.substring(1,pali.length()-1);
		return (check(substring));
	}
}