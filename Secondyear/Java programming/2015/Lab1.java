import java.util.*;

public class Lab1{
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int array[]= new int[3];

        for(int x=0; x<3; x++)
        {
        	array[x]=scan.nextInt();
        }
       Arrays.sort(array);

        int diff1, diff2;
        diff1=Math.abs(array[0]-array[1]);
        diff2=Math.abs(array[1]-array[2]);

          if(diff1==diff2)
        {
        	System.out.println("NA");
        }
        else if(diff1>diff2)
        {
        	System.out.println(array[0]);
        }
        else if(diff1<diff2)
        {
        	System.out.println(array[2]);
        }

    }
}