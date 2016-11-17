import java.util.*;

public class Lab12 {
    public static void main(String args[] ) throws Exception {
        Scanner myscanner = new Scanner(System.in);
        int num = Integer.parseInt(myscanner.nextLine());
        Link[] array = new Link[num];
        for(int i=0;i<num;i++){
            array[i]=new Link(myscanner.nextLine());
        }
        while(myscanner.hasNext()){
            int select=myscanner.nextInt();
            int next=myscanner.nextInt();
            if(next!=-1){
                array[select].next=array[next];
            }
        }
        LinkedList mylist = new LinkedList();
        if(num>0){
            mylist.first=array[0];
        }
        System.out.println(findLoopLength(mylist));
    }

    public static int findLoopLength(LinkedList mylist){
        if(mylist.isEmpty()){
            return(0);
        }
        Link[] checklist = new Link[100];
        int counter=0;
        Link forwards = mylist.first;
        while(forwards.next!=null){
            checklist[counter]=forwards;
            for(int i=0;i<counter;i++){
                if(forwards==checklist[i]){
                    return(counter-i);
                }
            }
            forwards=forwards.next;
            counter++;
        }
        return(0);
    }
}

class Link{
    public String data;
    public Link next;

    public Link(String input){
        data=input;
        next=null;
    }
}

class LinkedList {
    public Link first;

    public LinkedList( ){
        first=null;
    }

    public boolean isEmpty( ){
        return (first==null);
    }

    public void insertHead(Link insert){
        if(isEmpty()){
            first=insert;
        }else{
            insert.next=first;
            first=insert;
        }
    }
}
