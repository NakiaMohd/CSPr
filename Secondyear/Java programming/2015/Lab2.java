import java.util.*;

public class Lab2 {
    public static void main(String args[] ){
        Scanner scan = new Scanner (System.in);
        int input = Integer.parseInt(scan.nextLine());
        int array[] =new int[input];
        double avg=0;

        for (int x=0; x<input; x++)
        {
        	array[x]=scan.nextInt();
        	avg=avg+array[x];
        }
        Arrays.sort(array);

        avg=avg/input;
        int average =(int)avg;


        int A=array[0]; int B=array[1];

        for (int x=0; x<input; x++)
        {
        	if(array[x]<average)
        	{	A=array[x];
        		B=array[x+1];
        	}
	    }
	    double diff1=Math.round(Math.abs(A-average));
	    double diff2=Math.round(Math.abs(B-average));

  if (A==B)
  {
  	System.out.println(A);
  }
  else{

	    if (diff1==diff2)
	    {
	    	System.out.println(A);
	    }
	    else if (diff1<diff2)
	    {
	    	System.out.println(A);
	    }
	    else
	    {
	    	System.out.println(B);
	    }
  }
    }
}