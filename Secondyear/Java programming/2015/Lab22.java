import java.util.*;

public class Lab22{
public static void main(String args[] ) throws Exception {
 Scanner scan= new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int record=Integer.MIN_VALUE;
        for(int i = 0;i<=32;i++){
            for(int j=0;j<=32;j++){
                if(((num1<<i)|(num2<<j))>record){
                    record=((num1<<i)|(num2<<j));
                }
                if(((num1>>i)|(num2<<j))>record){
                    record=((num1>>i)|(num2<<j));
                }
                if(((num1<<i)|(num2>>j))>record){
                    record=((num1<<i)|(num2>>j));
                }
                if(((num1>>i)|(num2>>j))>record){
                    record=((num1>>i)|(num2>>j));
                }
            }
        }
        System.out.println(record);
}
}