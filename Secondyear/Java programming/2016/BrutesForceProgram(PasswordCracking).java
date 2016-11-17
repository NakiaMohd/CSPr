import java.util.Arrays;

public class BrutesForceProgram(PasswordCracking) {
  public static void main(String[] args) {
    bruteForce(3); // This shall be the size of the password inputed
  }
/////////////////////////////////////////////////////////////////////////////////////////////////////
  public static String bruteForce(int size) {
    int[] password = new int[size];
    String[] finalPassword = new String[size];

    for (int i = 0; i < size; i++) {
      password[i] = 0; // THIS will fill the password array with zeros
      finalPassword[i] = "";// THis fills the array with spaces
    }

    String pass = "AZ8";// The Acc password, change later to take in inputs

    return computePermutations(size, password, 0, pass);
    //Size of password
    //password ints
    //the search starts at position 0
    //the REAL password itself!!!!
    //SENDS INTO the method computePermutation
  }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
  private static String computePermutations(int size, int[] password, int position, String pass) {
    String testString = "";
    String assemble = "";//This is the string of assembled guesses of which the password maybe

    for (int i = 0; i < 36; i++) { //26 char of the alphaber and 10 digits 0-9
      password[position] = i; //starts at 0

      if (position != size - 1) {// if the position is NOT equal to the size(3 in this case)  then.....
        	testString = computePermutations(size, password, position + 1, pass);// test string is equal to the return of this method with a postion +1
    		    if (testString != "") {// if the testString is NOT equal to "" the return itself
     			     return testString;
      				 }
    		  }
     else if (position == size - 1) {// if the position is equal to the size
		        for (int j = 0; j < size; j++) {// THis loop will go thru the array from 0-size

		          switch (password[j] + 1) { //assemble string is adding on various cobinations
		            case 1:
		              assemble = assemble + "A";
		              break;
		            case 2:
		              assemble = assemble + "B";
		              break;
		            case 3:
		              assemble = assemble + "C";
		              break;
		            case 4:
		              assemble = assemble + "D";
		              break;
		            case 5:
		              assemble = assemble + "E";
		              break;
		            case 6:
		              assemble = assemble + "F";
		              break;
		            case 7:
		              assemble = assemble + "G";
		              break;
		            case 8:
		              assemble = assemble + "H";
		              break;
		            case 9:
		              assemble = assemble + "I";
		              break;
		            case 10:
		              assemble = assemble + "J";
		              break;
		            case 11:
		              assemble = assemble + "K";
		              break;
		            case 12:
		              assemble = assemble + "L";
		              break;
		            case 13:
		              assemble = assemble + "M";
		              break;
		            case 14:
		              assemble = assemble + "N";
		              break;
		            case 15:
		              assemble = assemble + "O";
		              break;
		            case 16:
		              assemble = assemble + "P";
		              break;
		            case 17:
		              assemble = assemble + "Q";
		              break;
		            case 18:
		              assemble = assemble + "R";
		              break;
		            case 19:
		              assemble = assemble + "S";
		              break;
		            case 20:
		              assemble = assemble + "T";
		              break;
		            case 21:
		              assemble = assemble + "U";
		              break;
		            case 22:
		              assemble = assemble + "V";
		              break;
		            case 23:
		              assemble = assemble + "W";
		              break;
		            case 24:
		              assemble = assemble + "X";
		              break;
		            case 25:
		              assemble = assemble + "Y";
		              break;
		            case 26:
		              assemble = assemble + "Z";
		              break;
		            case 27:
		              assemble = assemble + "0";
		              break;
		            case 28:
		              assemble = assemble + "1";
		              break;
		            case 29:
		              assemble = assemble + "2";
		              break;
		            case 30:
		              assemble = assemble + "3";
		              break;
		            case 31:
		              assemble = assemble + "4";
		              break;
		            case 32:
		              assemble = assemble + "5";
		              break;
		            case 33:
		              assemble = assemble + "6";
		              break;
		            case 34:
		              assemble = assemble + "7";
		              break;
		            case 35:
		              assemble = assemble + "8";
		              break;
		            case 36:
		              assemble = assemble + "9";
		              break;
		          }

		        }
        System.out.println(assemble);//prints out all other assemble cases

        if (assemble.equalsIgnoreCase(pass)) {

          System.out.println("Password is: " + assemble);
          return assemble;// return acc password
          }
         else {
          assemble = "";
        }
      }
    }//END OF FIRST FOR LOOP
    return "";
  }
}