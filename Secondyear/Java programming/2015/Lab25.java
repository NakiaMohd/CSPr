import java.util.*;
public class Lab25{

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
}///////////////////////////////////////////////////
class Stack
{
	private int maxSize;
	private char[] stackArray;
	private int top;

	public Stack(int s)
	{
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}

	public void push(char j)
	{
		top++;
		stackArray[top] = j;
	}
	public char pop()
	{
		return stackArray[top--];
	}
	public char peek()
	{
		return stackArray[top];
	}
	public boolean isEmpty()
	{
		return(top == -1);
	}
	public boolean isFull()
	{
		return (top == maxSize-1);
	}
	}
