/*
Use stack method
Palidrome a sentence or word
Ignores all the spaces
Only lower case letters
Output TRUE or False
*/
import java.util.*;

public class Practice6{

public static void main(String args[])
	{
				Scanner scan= new Scanner(System.in);
		String input= scan.nextLine();

		input=input.replaceAll(" ","");
		int size=input.length();
		String output= "";

		Stack newStack = new Stack(size);

		for(int x=0; x<size; x++)
		{
			newStack.push(input.charAt(x));
		}
		while (!newStack.isEmpty())
		{
			output= output + newStack.pop();
		}
		if (input.equals(output))
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
}
