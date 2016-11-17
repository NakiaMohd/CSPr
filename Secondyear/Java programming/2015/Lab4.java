import java.util.*;

public class Lab4 {
    public static void main(String args[] ) throws Exception {
    	Scanner scan = new Scanner(System.in);
    	int prime = scan.nextInt();
    	int count=0;

			for(int x = 2; x <prime ; x++)
			{
				if(prime%x == 0)
				{
					count++;
					System.out.println(count);
				}
			}

    	if (count==0)
    		System.out.println("TRUE");

    	else
    		System.out.println("FALSE");
    }
}
/*OOOOOOORRRRRRRRRR*/
/*
import java.util.*;

public class Lab4
{
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		boolean isPrime[] = new boolean[num+1];
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
			System.out.println("TRUE");
		}

		else{
                System.out.println("FALSE");
        }
    }
}
*/