import java.util.*;
public class Lab9{
	public static void main(String args[])
	{
		Scanner scan= new Scanner (System.in);
		Queue q = new Queue(20);

		while(scan.hasNext()){
			String input= scan.nextLine();

			if(input.equals("REMOVE")){
				if(!q.isEmpty()){
					q.remove();
				}
			}
			else{
			q.insert(input.substring(7,input.length()));
				}
		}

        if(!q.isEmpty()){
            System.out.println(q.remove());}

		else{
			System.out.println("empty");
		}
	}
}
class Queue{

    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s){
        maxSize = s;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public boolean insert(String item){
        if(!isFull()){
            rear++;
            queArray[rear]=item;
            nItems++;
            return true;
        }else{
            return false;
        }
    }

    public String remove(){
        String temp = queArray[front];
        front++;
        if(front == maxSize)
        front = 0;
        nItems--;
        return temp;
    }

    public boolean isEmpty(){
        return (nItems==0);
    }

    public boolean isFull(){
        return (nItems==maxSize);
    }

    public int size(){
        return nItems;
    }
}