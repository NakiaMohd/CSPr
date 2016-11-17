import java.util.*;
public class Lab21{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int byte1 = num<<24;
        int byte2 = ((num>>>8)<<24)>>>8;
        int byte3 = ((num>>>16)<<24)>>>16;
        int byte4 = num>>>24;
        System.out.println(byte1|byte2|byte3|byte4);
	}
}