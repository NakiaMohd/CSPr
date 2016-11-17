import java.util.*;

public class Lab5
{
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count1 = 0, count2 = 0;

		boolean isPrime[] = new boolean[num+10];
		Arrays.fill(isPrime, true);

		for(int i = 2; i < isPrime.length; i++)
		{
			if(isPrime[i] == true && 2*i < isPrime.length){
				for(int j = i*i;  j < isPrime.length;  j+=i){
					isPrime[j] = false;
				}
			}
		}

		if(isPrime[num]== true){
			System.out.println(num);
		}

		else{
			for(int i = num; i < isPrime.length; i++){
				if(isPrime[i] == false)
					count1++;

				else{
					i = isPrime.length;
				}
			}


			for(int i = num; i > 2; i--){
				if(isPrime[i] == false)
					count2++;

				else{
					i = 1;
				}
			}

			if(count1 >= count2)
			{
				System.out.println(num-count2);
			}
			else{
				System.out.println(num+count1);
			}}
	}
}