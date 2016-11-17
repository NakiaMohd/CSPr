import java.util.*;

public class TimeConvertion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();// MUST ENTER hr:mm;ss;(AM/PM)

        int a=Integer.parseInt(time.substring(0,2));//the hr
        String b=time.substring(3,5); //the mins
        String c=time.substring(6,8); //the seconds

        if((a==12)&& (time.substring(8,9).equals("A")) ){//If its AM and 12 change to 00
            System.out.println("00"+":"+b+":"+c);
        }
         else if(time.substring(8,9).equals("A")){//if its AM add a 0 inront of the digit
          if(a<10){
              System.out.println("0"+a+":"+b+":"+c);
          }
          else{
              System.out.println(a+":"+b+":"+c);
          }
        }

        else if( (a==12) && (time.substring(8,9).equals("P")) ){
            System.out.println(12+":"+b+":"+c);
        }
        else{
            System.out.println((a+12)+":"+b+":"+c);
        }

    }
}
