import java.util.*;

public class Lab29{
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);

		int nth = scan.nextInt();
		int num, count, i;
		num=1;
		count=0;
		while (count < nth){

			num=num+1; //find the next prime number
			for (i = 2; i <= num; i++){

				if (num % i == 0) {

					break; //prime not found
				}
			}
			if ( i == num){

				count = count+1;
			}
		}
		System.out.println(num);

	}
}
