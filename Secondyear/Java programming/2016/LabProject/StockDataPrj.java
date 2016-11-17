import java.util.*;
import java.io.*; //used by FileIO

public class StockDataPrj
{
	public static void main(String args[])
	{
		FileIO io = new FileIO();
		String[] original = io.load("C:\\Users\\Nakia\\Desktop\\CS 2016 2YR\\CS211\\LabProject\\StockData.txt");
		String[] Price = io.load("C:\\Users\\Nakia\\Desktop\\CS 2016 2YR\\CS211\\LabProject\\StockPrice.txt");

		Random ran = new Random();
		int numrows = original.length;
		int numcols = original[0].split("\t").length;

		double[][] array = new double[numrows][numcols];
		for(int i=1;i<numrows;i++)
		{
			for(int j=1;j<numcols;j++)
			{
				array[i][j]=Double.parseDouble(original[i].split("\t")[j]);
			}
		}

 	String date[] = new String[numrows];

          int stockBought[]= new int [466];

          for(int x=0; x<466; x++){
        	  stockBought[x]=1; //ran.nextInt(3)+1; //When ready use randomiser to check how Volatility changes
        	  //System.out.print(stockBought[x]+"   ");// Print Array String of numbers
          }

	  		int rows = 466;//Price.length;
	  		double StockPrice[]= new double[rows];
	  		for(int i=0;i<rows;	i++){
	  				StockPrice[i]=Double.parseDouble(Price[i]);
	  				//System.out.print(StockPrice[i]+"   ");// Print out stock prices
	  			}

	    double sumOfInvested[]= new double [rows];
	  	double Invested =0;//Sums up the overall amount Invested
	  		for(int i=0;i<rows;	i++){
	  			sumOfInvested[i]=StockPrice[i]*stockBought[i];
	  			Invested=sumOfInvested[i]+Invested;
  			}
	  		double run=0;
	          //double run=array[2][1]*sumOfInvested[0];
	         // System.out.println("array: "+array[2][1]);
	        //  System.out.println("array: "+array[1][2]);
	        //  System.out.println("run: "+run);
	          //first box increments


	         /* for(int i=0; i<rows; i++)
	    	  {
	    			System.out.print(sumOfInvested[i]+"\n");
	    	  }*/
//////////////////////////////////////////////////////////////////////////
	          //double [] topPartOfFormula=new double [rows];
	          String output="";
	     for(int i=1;i<rows;i++)
	  		{//run is adding up all the changes and putting it into a string
	  				for(int k=0;k<rows;k++){
	  					run=array[k+1][i]*sumOfInvested[i-1];
	  					output=output+","+run;

	  					System.out.println(output);
	  			}//topPartOfFormula[i]=run;
	  			//System.out.println(topPartOfFormula[i-1]);
	  		}
	   // System.out.println(output);

	    String[] strArray = output.split(",");
	    double[] vol = new double[strArray.length];
	     double lastsum=0;

	    for(int i = 0; i < rows; i++) {
	    	    try {
	    	    	vol[i]=Double.parseDouble(strArray[i]);
	    	    	lastsum=lastsum+vol[i];
	    	    } catch (NumberFormatException nfe) {};
	         //System.out.println(out[i]);
	     }
	     double changePercentage=lastsum/Invested;

			// calculating mean.
			int total = 0;
			//double vo [] = new double [881];

			for(int i = 0; i < vol.length; i++){
			   total += vol[i]; // this is the calculation for summing up all the values
			}

			double mean = total / vol.length;
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

			for(int i = 0; i < vol.length; i++){
				   vol[i] = Math.pow((vol[i]-mean),2);
				}
	   //  System.out.println();

		      int sum=0;
		      System.out.println("Mean : "+mean); //Display mean of all elements

		      double [] temp= new double[strArray.length];
		      for (int i=0; i<strArray.length; i++) //calculate standard deviation
		     {
		           temp[i]=Math.pow((vol[i]-mean),2);
		           sum+=temp[i];
		     }
		      mean=sum/vol.length;
		      double deviation=Math.sqrt(mean);
		      System.out.println("Deviation : "+ deviation);


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