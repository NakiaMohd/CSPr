import java.util.*;
public class Lab28{
		public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());

		String list[] = new String[num];

		for(int i = 0; i<list.length; i++)
		{
			list[i] = in.nextLine();
		}
		String temp = new String();

		for(int i = 0; i<list.length-1; i++){

			for(int j =i+1; j<list.length; j++){
				if(list[i].compareTo(list[j]) > 0)
				{
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}

		//PRINTING OUT THE ARRAY PART
		for(int k = 0; k<list.length; k++){
			System.out.print(list[k]+" ");
		}
}
}