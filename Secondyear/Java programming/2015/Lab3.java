import java.util.*;
public class Lab3{
    public static void main(String args[] ){

      Scanner scan = new Scanner(System.in);
      int input=Integer.parseInt(scan.nextLine());
      int array[] = new int[input];

      for(int x=0; x<input; x++)
      {
      	array[x]=scan.nextInt();
      }

      int mode=0;
      int m1=0;

      for(int x=0; x<input; x++)
      {
      	int count=0;

      	for(int y=0; y<input; y++)
      	{
      		if(array[x]==array[y])
      			count++;
      	}
     if(count>m1)
     	{
                m1=count;
                mode=array[x];
        }
      }
System.out.println(mode);
    }
}