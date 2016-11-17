/*
Grab a stick. Pick a random point on the stick and break it in two.
Take the longer piece.
Now pick a random point on the longer piece and break it in two, to make three pieces altogether.

What is the probability you can form a triangle?
*/
public class Lab1Triangle{
	public static  Node root;
//	this.root = null;

	public static void main(String args[]){
		//double n=3;
		//System.out.println(1-stick(n));
		Lab1Triangle b = new Lab1Triangle();
		System.out.println("Original Tree : ");
		b.display(b.root);
		System.out.println("");
	}
	public Node find (int key){
			Node current = root; //start at the root

			while(current.data != key){ //while no match
				if(key < current.data) //go left?
					current=current.leftChild;
				else
				current=current.rightChild; //or go right?

				if(current == null) // if no child
				return null; // didn’t find it
				}
				return current;
			}

public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
}
	class Node{
		int data;
		Node left;
		Node right;

		public Node(int data){
		this.data = data;
		left = null;
		right = null;
		}
	}

}
