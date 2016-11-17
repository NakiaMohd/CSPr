import java.util.*;
public class Fractions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//Scanner takes in keyBoard inputs
        int n = in.nextInt();//The size/number of inputs you want
        int arr[] = new int[n];//Make an array to sore the inputs

        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();//FIll in the array
        }
        int a,b,c;//counters
        a=0;
        b=0;
        c=0;

       for(int i=0; i < n; i++){
           if(arr[i]<0){
                a++;
            }
           else if(arr[i]==0){
               b++;
           }
           else{
               c++;
           }
        }
        double avgN=(double)a/n;//cast them to double first-1

        double avg0=(double)b/n;
        double avgP=(double)c/n;

        System.out.println(String.format("%.6g",avgP));//for decimal places rounding
        System.out.println(String.format("%.6g",avgN));
        System.out.println(String.format("%.6g",avg0));

    }
}