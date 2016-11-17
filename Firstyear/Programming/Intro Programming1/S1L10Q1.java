import java.util.*;
public class S1L10Q1
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

do
{
		if(Flight.equalsIgnoreCase("FR1290"))
		{
			System.out.println("\nAirline: "+Fra);
			System.out.println("Flight number: 1290\n");
			Flight=new String(scan.nextLine());
		}

		else if(Flight.equalsIgnoreCase("EI9397"))
		{
			System.out.println("\nAirline: "+Ail);
			System.out.println("Flight number: 9397\n");
			Flight=new String(scan.nextLine());
		}
		else if(Flight.equalsIgnoreCase("AF4457"))
		{
			System.out.println("\nAirline: "+Afra);
			System.out.println("Flight number: 4467\n");
			Flight=new String(scan.nextLine());
		}
		else if(Flight.equalsIgnoreCase("AA0753"))
		{
			System.out.println("\nAirline: "+Ama);
			System.out.println("Flight number: 0753\n");
			Flight=new String(scan.nextLine());
		}
		else if(Flight.equalsIgnoreCase("BE3489"))
		{
			System.out.println("\nAirline: "+Flyb);
			System.out.println("Flight number: 3489\n");
			Flight=new String(scan.nextLine());
		}

		else if(Flight.equals("END"))
		{
			break;
		}
		else
		{
			System.out.println("\nInvalid flight code\n");
			Flight=new String(scan.nextLine());
		}

}while(Flight!="END");
	}
}