import java.util.*;

public class CrackTheMessage {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter public key:");
		System.out.println("Enter modulus");
		long p = sc.nextLong();
		System.out.println("Enter generator");
		long g = sc.nextLong();
		System.out.println("Enter g^x mod p");
		long gxvalue = sc.nextLong();
		long privateKey = 0;

 long current = g;
 long pow = 1;

 while(current!=gxvalue){
 pow=pow+1;
current = modMult(current,g,p);
if(current >= p){
 current=current%p;
 }
 }
				System.out.println("\nPrivate key is:	" + pow);
		System.out.print("Please enter c1: ");
		long c1 = sc.nextLong();
		System.out.print("Please enter c2: ");
		long c2 = sc.nextLong();
		long power = (p-1-privateKey);
		long part1=modPow(c1,power,p);// first part of the formula in slide 4 in oage 6 EXAMPLE
	    long part2=modPow(part1*c2,1,p);

	    System.out.println(part2);
	}

	//////////////////////PHILS (BAEEE )CRAP ALL BELOW
	public static long modPow(long number, long power, long modulus){
		//raises a number to a power with the given modulus

		//you need to multiply numbers in such a way that the result is consistently moduloed to keep it in the range
		//however you want the algorithm to work quickly - having a multiplication loop would result in an O(n) algorithm!
		//the trick is to use recursion - keep breaking the problem down into smaller pieces and use the modMult method to join them back together
			if(power==0)
			return 1;

			else if (power%2==0) {
				long halfpower=modPow(number, power/2, modulus);
				return modMult(halfpower,halfpower,modulus);
			}
			else{
				long halfpower=modPow(number, power/2, modulus);
				long firstbit = modMult(halfpower,halfpower,modulus);
				return modMult(firstbit,number,modulus);
			}
	}

	public static long modMult(long first, long second, long modulus){
		//multiplies the first number by the second number with the given modulus
		//a long can have a maximum of 19 digits. Therefore, if you're multiplying two ten digits numbers the usual way, things will go wrong
		//you need to multiply numbers in such a way that the result is consistently moduloed to keep it in the range
		//however you want the algorithm to work quickly - having an addition loop would result in an O(n) algorithm!
		//the trick is to use recursion - keep breaking down the multiplication into smaller pieces and mod each of the pieces individually
		if(second==0)
		return 0;

		else if (second%2==0) {
			long half=modMult(first, second/2, modulus);
			return (half+half)%modulus;
		}
		else{
			long half=modMult(first, second/2, modulus);
			return (half+half+first)%modulus;
		}
	}
}