import java.util.*;

public class Attempt
{

   static String[] c;
   static int count = 0;

   public static void main(String[] args)
   {
   		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your letters:");

		String input=scan.nextLine();
		System.out.println();

		char c []= new char [input.length()];

				for(int x=0;x<c.length; x++){
			c[x]=input.charAt(x);
		}

      c = .toArray(new String[0]);("aa","bb","cc").toArray(new String[0]);
      permutation(0);
      System.out.println("Number of permutations = " + count);
   }

   static void swap(int pos1, int pos2)
   {
      String temp = c[pos1];
      c[pos1] = c[pos2];
      c[pos2] = temp;
   }

   public static void permutation(int start)
   {
      if (start != 0)
      {
         for (int i = 0; i < start; i++)
            System.out.print(c[i]);
         System.out.println();
         count++;
      }

      for (int i = start; i < c.length; i++)
      {
         swap(start, i);
         permutation(start + 1);
         swap(start, i);
      }
   }
}