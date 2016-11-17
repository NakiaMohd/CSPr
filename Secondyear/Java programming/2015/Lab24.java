import java.util.*;

public class Lab24 {
	public static void main(String args[] ) throws Exception {
    	Scanner myscanner = new Scanner(System.in);
    	int num = Integer.parseInt(myscanner.nextLine());
    	Link[] array = new Link[num];
    	for(int i=0;i<num;i++){
        	array[i]=new Link(myscanner.nextLine());
    	}
    	while(myscanner.hasNext()){
        	int select=myscanner.nextInt();
        	int previous=myscanner.nextInt();
        	int next=myscanner.nextInt();
        	if(previous!=-1){
            	array[select].previous=array[previous];
        	}
        	if(next!=-1){
            	array[select].next=array[next];
        	}
    	}
    	LinkedList mylist = new LinkedList();
    	if(num>0){
        	mylist.first=array[0];
        	mylist.last=array[num-1];
    	}
    	System.out.println(check(mylist));
	}

//INSERT CODE HERE
    public static String check(LinkedList ll) {

        if (ll.isEmpty()) return "empty";

        Link f = ll.first;

        if (f.previous != null) return "FALSE";

        while (true) {
            if (f.next == null) break;
            else if (f!=f.next.previous) {
                return "FALSE";
            }
            f = f.next;
        }
        return "TRUE";
    }

//STOP INSERTING CODE HERE

}

class Link{
    public String data;
    public Link next;
    public Link previous;

	public Link(String input){
    	data=input;
    	next=null;
    	previous=null;
	}
}

class LinkedList {
    public Link first;
	public Link last;

    public LinkedList( ){
   	 first=null;
    	last=null;
    }

    public boolean isEmpty( ){
   	 return (first==null);
    }

	public void insertHead(Link insert){
    	if(isEmpty()){
        	first=insert;
        	last=insert;
    	}else{
        	first.previous=insert;
        	insert.next=first;
        	first=insert;
    	}
	}
}