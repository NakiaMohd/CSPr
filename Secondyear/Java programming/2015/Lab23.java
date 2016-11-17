import java.util.*;

public class Lab23{
	public static void main (String args[])
	{
		Scanner scan = new Scanner (System.in);
		int N = Integer.parseInt(scan.nextLine());

		String names []= new String[N];

		for(int i = 0; i < names.length; i++)
		{
			names[i]=scan.nextLine();
		}
		mergeSort(names);

		for(int i = 0; i < names.length; i++)
    	{
        	System.out.println(names[i]);
    	}

	}

	public static void mergeSort (String Array[])
	{
		if (Array.length >= 2)
		{
			String ArrayL [ ]=new String [Array.length/2];
			String ArrayR [ ]=new String [Array.length-(Array.length/2)];

				for(int x=0; x<ArrayL.length; x++)
				{
					ArrayL[x] = Array[x];
				}

				for(int x=0; x<ArrayR.length; x++)
				{
					ArrayR[x] = Array[x+(Array.length/2)];
				}

		mergeSort(ArrayL);
		mergeSort(ArrayR);
		merge(Array, ArrayL, ArrayR);
		}

	}
		public static void merge(String Array[], String ArrayL[],String ArrayR[])
		{
			int a=0;
			int b=0;

			for(int x=0; x<Array.length; x++)
			{
				if (b >= ArrayR.length || (a <ArrayL .length &&(alphabetical(ArrayL[a],ArrayR[b]) == 2))) {
                Array[x] = ArrayL[a];
                a++;
            } else {
                Array[x] = ArrayR[b];
                b++;
            }
			}

		}
		public static int alphabetical (String a, String b)
		{
    		if(a.equals(b))
				return 1;

    		if(a.length() == 0)
       		 	return 2;

    	else if(b.length() == 0)
        	return 1;

    	int s1 = a.length() -1;
    	int s2 = b.length() -1;

    	if(a.charAt(s1) > b.charAt(s2))
        	return 1;

    	else if(a.charAt(s1) < b.charAt(s2))
        	return 2;

    	else
    	{
        	String sorta= a.substring(0,s1);
        	String sortb= b.substring(0,s2);
        	return alphabetical(sorta,sortb);
    	}
}
}