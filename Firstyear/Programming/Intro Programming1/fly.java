import java.util.*;
public class fly
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a flight code:");

		String Fra= new String("Ryanair");
		String Ama= new String ("American Airline");
		String Afra=new String ("Air France");
		String Flyb=new String ("Fly Be");
		String Ail= new String ("Air Lingus");
		String Flight=new String(scan.nextLine());

		switch(Flight)
		{
			case Fra: System.out.println("Ryanair");break;
		}
	}
}