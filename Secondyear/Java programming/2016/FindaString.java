import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindaString {

    public static void main(String[] args) {
		System.out.println("Enter String to match: ");
        Regex_Test tester = new Regex_Test();//Method calling class object

        Scanner scan = new Scanner(System.in);
        tester.checker(scan.nextLine());//Takes in String

    }
}

class Regex_Test {
    public void checker(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Text:		");
        String Test_String = Input.nextLine();//Enter Text


        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);

        int Count = 0;// Counts the accurance of a String

        while(m.find()){
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }
}