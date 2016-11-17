import java.util.Scanner;

public class Lab10 {
    public static void main(String args[] ) throws Exception {


        Scanner myscanner = new Scanner(System.in);
        Queue myqueue = new Queue(20);
        while(myscanner.hasNext()){
            String input = myscanner.nextLine();
            if(input.equals("REMOVE")){
                if(!myqueue.isEmpty()){
                    myqueue.remove();
                }
            }else{
                myqueue.insert(input.substring(7,input.length()));
            }
        }
        if(!myqueue.isEmpty()){
            int middle = myqueue.size();
            if(middle%2==1){
                middle++;
            }
            middle=middle/2;
            for(int i =0; i<middle-1;i++){
                myqueue.remove();
            }
            System.out.println(myqueue.remove());
        }else{
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