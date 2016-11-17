 import java.util.*;
import java.io.*;


public class Lab5{
	public static void main(String args[]){

		FileIO reader = new FileIO();
		String[] contents=reader.load("dictionary.txt");
		String topTen[]=new String [10];
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter your letters:");
		String input=scan.nextLine();
		System.out.println();

		char breakdown []= new char [input.length()];

		for(int x=0;x<breakdown.length; x++){
			breakdown[x]=input.charAt(x);
		}

		for(int x=0;x<breakdown.length; x++){//goes thru char array of input letters

				for(int y=0; y<contents.length;y++){//goes thru array of dictionary

				if(contents[y].length()<=breakdown.length){

					for(int z=0; z<contents[y].length(); z++){//goes thru a word length

						if((breakdown[x]==contents[y].charAt(z)) || (breakdown[x]+breakdown[x+1]==contents[y].charAt(z))){
						System.out.println(contents[y]);
						}
					}
				}
				}
		}

/*
	for(int x=0; x<breakdown.length; x++){
		System.out.println(breakdown[x]);

		}*/







		System.out.println("Here are the top 10 suggestions:\n");
		for(int x=0; x<topTen.length; x++){

		}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 /*       try{
            reader.save("C://somefile.csv",contents);
        }catch (Exception e){
            System.out.println(e.getClass());
        }*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}
}

class FileIO{

  public String[] load(String file) {
    File aFile = new File(file);
    StringBuffer contents = new StringBuffer();
    BufferedReader input = null;
    try {
      input = new BufferedReader( new FileReader(aFile) );
      String line = null;
      int i = 0;
      while (( line = input.readLine()) != null){
        contents.append(line);
        i++;
        contents.append(System.getProperty("line.separator"));
      }
    }
    catch (FileNotFoundException ex) {
      System.out.println("Can't find the file - are you sure the file is in this location: "+file);
      ex.printStackTrace();
    }
    catch (IOException ex){
      System.out.println("Input output exception while processing file");
      ex.printStackTrace();
    }
    finally {
      try {
        if (input!= null) {
          input.close();
        }
      }
      catch (IOException ex) {
        System.out.println("Input output exception while processing file");
        ex.printStackTrace();
      }
    }
    String[] array = contents.toString().split("\n");
    for(String s: array){
        s.trim();
    }
    return array;
  }


  public void save(String file, String[] array) throws FileNotFoundException, IOException {

    File aFile = new File(file);
    Writer output = null;
    try {
      output = new BufferedWriter( new FileWriter(aFile) );
      for(int i=0;i<array.length;i++){
        output.write( array[i] );
        output.write(System.getProperty("line.separator"));
      }
    }
    finally {
      if (output != null) output.close();
    }
  }
}