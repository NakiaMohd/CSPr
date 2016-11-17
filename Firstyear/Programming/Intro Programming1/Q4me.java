import java.util.*;

public class Q4me
	{
		public static void main(String args[])
		{
			System.out.println("Enter your name: ");

			Scanner scan=new Scanner(System.in);

			String name=new String (scan.nextLine());

			System.out.println("Your name is " +name.toUpperCase()+"\n");

			System.out.println("Firstname is " +name.substring(0,5));
			System.out.println("Lastname is " +name.substring(6,14)+"\n");


			System.out.println("Enter your age: ");
			int age= scan.nextInt();
			System.out.println("Your age is "+age+"\n");

			System.out.println("Enter what you think your wages are :");
			float wages= scan.nextFloat();



			if((name.substring(0,4)).equals("Nakia"));
			{
				System.out.println("Your wages have increased to "+(wages*2.3));
			}

		}
}