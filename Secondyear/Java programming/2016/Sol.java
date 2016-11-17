import java.io.*;
import java.util.*;

public class Sol {
public static void main(String args[] ) throws Exception {
    Scanner in= new Scanner(System.in);
          int T=in.nextInt();

            for(int x=1; x<=T; x++)
            {
                int A=in.nextInt();
                int B=in.nextInt();

                int sum=A+B;
                System.out.println(sum);
            }
}
}
