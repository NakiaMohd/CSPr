import java.io.*;
import java.util.*;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node
{
        public char letter;
        public Node leftChild;
        public Node rightChild;

}

class Tree implements Comparable<Tree>{
  public Node root;             // first node of tree
  public int frequency=0;

// -------------------------------------------------------------
  public Tree()                  // constructor
     {   root = null; }            // no nodes in tree yet
// -------------------------------------------------------------

//the PriorityQueue needs to be able to somehow rank the objects in it
//thus, the objects in the PriorityQueue must implement an interface called Comparable
//the interface requires you to write a compareTo() method so here it is:

  public int compareTo(Tree object)
  {
           if(frequency-object.frequency>0)
           { //compare the cumulative frequencies of the tree
          return 1;
       }

           else if(frequency-object.frequency<0)
           {
          return -1;   //return 1 or -1 depending on whether these frequencies are bigger or smaller
       }

           else

           {
           return 0;   //return 0 if they're the same
       }
  }

// -------------------------------------------------------------

  String path="error";     //this variable will track the path to the letter we're looking for

 public String getCode(char letter){  //we want the code for this letter

      inOrder(root, letter," ");    //call an inOrder traversal, starting at the root, looking for this letter
      return path;     //return the path that results

  }

// -------------------------------------------------------------
  private void inOrder(Node localRoot, char letter, String path)
  { //the path variable tracks the current search path
     if(localRoot != null)
     { //if root is null we've gone off the edge of the tree - back up
         if(localRoot.letter==letter)
         {
           this.path=path;     //if we've found the letter, note the path - final path = current search path
         }

         else
         {
           inOrder(localRoot.leftChild, letter, path+"0"); //go left and add "0" to the current search path
           inOrder(localRoot.rightChild, letter, path+"1");    //go right and add "1" to the current search path
        }
     }
     return; //quit searching this branch of the tree
  }
// -------------------------------------------------------------
}  // end class Tree
////////////////////////////////////////////////////////////////

public class Huffman{

   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);

       System.out.print("Enter your sentence: ");
       String sentence =". ©¯`ù~¡$­ù¯¡ùç¡½($ªç¡þ v¡­ù?(­ù­($?ù$$(¡$?­þ .6ù¡­?ù?($ùª¡ù~(çù¥($ªç¡ vóP)?¡ùª¡­ù¥P¿­P$­þ ãPç­`ù¯(ç$¡ù¡?ùòPç()Ø¡` ã()­­¡ùª¡­ùØ)ç6¡¯¡$?­ k?ù­¡ù?(çª     ";
       	     String binaryString="";      //this stores the string of binary cod
       System.out.println();
       for(int i=0; i < sentence.length(); i++)
       {        //go through the sentence
           int decimalValue = (int)sentence.charAt(i);      //convert to decimal
           String binaryValue = Integer.toBinaryString(decimalValue);      //convert to binary
           for(int j=7;j>binaryValue.length();j--)
           {
               binaryString+="0";           //this loop adds in those pesky leading zeroes (7 bits)
           }
           binaryString += binaryValue+" "; //add to the string of binary
       }
       System.out.println(binaryString);    //print out the binary
//////////////////////////////////////
//counter for bits
       	double counter=0, counter2=0;
		for(int x=0; x<binaryString.length(); x++)
		{
			if((binaryString.charAt(x)=='0')||(binaryString.charAt(x)=='1'))
			{
				counter++;
			}
		}
		System.out.println();
//////////////////////////////////////////////////////////////////////

       int[] array = new int[256];      //an array to store all the frequencies

       for(int i=0; i < sentence.length(); i++)
       {    //go through the sentence
           array[(int)sentence.charAt(i)]++;    //increment the appropriate frequencies

       }
System.out.println();

                //make a priority queue to hold the forest of trees
       PriorityQueue < Tree >  PQ = new PriorityQueue < Tree >() ;
      String org [] =  new String[array.length];

       for(int i=0; i<array.length; i++)
       {

           if(array[i]>0)
           {
                //print out non-zero frequencies - cast to a char
                org[i]=("'"+(char)i+"' appeared "+array[i]+((array[i] == 1) ? " time" : " times"));

               Tree myTree = new Tree();
      //set the cumulative frequency of that Tree
               myTree.frequency = array[i];
               myTree.root = new Node();

               Node myNode = new Node();
       //insert the letter as the root node
               myNode.letter = (char)i;
               myTree.root = myNode;
      //add the Tree into the PQ
               PQ.add(myTree);
           }
       }

       for (int x=0; x<org.length; x++)
       {
       	if (org[x] !=null){
       		System.out.println(org[x]);
       	}
       }
       while(PQ.size()>1)
       {             //while there are two or more Trees left in the forest

    //combines tree

           Tree firstTree = PQ.poll();
           Tree secondTree = PQ.poll();
           Tree comboTree = new Tree();

           comboTree.root = new Node();
           comboTree.frequency= firstTree.frequency + secondTree.frequency;

           if(firstTree.frequency < secondTree.frequency)
           {
               //if the firstTree is less than the secondTree make firstTree as left node or leftChild
                //and then secondTree be the rightChild or node
               comboTree.root.rightChild = secondTree.root;
               comboTree.root.leftChild = firstTree.root;
           }

           else
           {

               comboTree.root.rightChild = firstTree.root;
               comboTree.root.leftChild = secondTree.root;
           }
           //add them together into a tree
           PQ.add(comboTree);
       }
       System.out.println();

       //IMPLEMENTS THE HUFFMAN ALGO
                Tree HuffmanTree = PQ.poll();   //now there's only one tree left - get its codes

                //FILL THIS IN
       //int totalLength=0;
       String theCode="";
       String topBits="";
       //get all the codes for the letter and print them out
       for (int i=0; i<sentence.length(); i++)
       {
        //call the getCode() method on the HuffmanTree Tree object for each letter in the sentence
        theCode = HuffmanTree.getCode(sentence.charAt(i));
        //print out all the info

        System.out.print(theCode +" ");
        topBits+=theCode;

       }
       		for(int x=0; x<topBits.length(); x++)
		{
			if((topBits.charAt(x)=='0') || (topBits.charAt(x)=='1'))
			{
				counter2++;
			}
		}

		double perc=((counter2/counter)*100);
		System.out.println("\nCompressed size is "+(int)counter2+"bits / "+(int)counter+"bits = "+ (int)(perc)+"%");
   }
}