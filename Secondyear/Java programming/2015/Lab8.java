import java.util.*;

public class Lab8{
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	Queue que = new Queue(100);

    while (scan.hasNextInt())
        {
        int input=scan.nextInt();
        que.insert(input);
    }
    while (!que.isEmpty())
	   System.out.println(que.remove());
    }
}
/*****************************************************************************************************/
class Queue{
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

        public Queue(int s) {
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	public void insert(int item) {
		if (nItems == 0) {
			queArray[0] = item;
		} else {
			int j = nItems;

			while (j > 0 && queArray[j - 1] < item) {
				queArray[j] = queArray[j - 1];
				j--;
			}
			queArray[j] = item;
		}
		front = nItems;
		nItems++;
	}
	public int remove() {
		int temp = queArray[front];
		front--;
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}
	public int size() {
		return nItems;
	}
}