public class Stack{
	//Placed outside so all A&C can use them
	private int maxSize;// Max size of the stack can hold
	private int top;//what is currently on the top stack
	private char [] stackArray;// the acctual stack

		public Stack(int s){//takes in a number from main method of current stack size
			top=-1;// it starts off empty
			maxSize=s;//max size of Stack
			stackArray=new char [maxSize]; //this is a stack of characters
		}
			public void push(char c){//take in an item from main method to store into stack
				top++;// add a space in stack for item
				stackArray[top]=c;
			}
				public char peek(){//check whats on top of the stack
					return stackArray[top];
				}
				public char pop(){//kick one item off
					return stackArray[top--];
				}
					public boolean IsEmpty(){//checks if stack is empty
						return (top==-1);
					}
					public boolean IsFull(){//check if stack is full
						return top==maxSize-1;
					}
}