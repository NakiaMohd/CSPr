import java.util.*;

public class project
{
	public static void main(String args[])
	{
		Random gen = new Random();
		//takes in multiple line text file as strings in an array eg line 1 is first entry in array
		FileIO io = new FileIO();
		//takes in a string array of values in file
		String[] original = io.load("C:\\Users\\Nakia\\Desktop\\CS 2016 2YR\\CS211\\LabProject\\StockData.txt");
		String[] stockPrice = io.load("C:\\Users\\Nakia\\Desktop\\CS 2016 2YR\\CS211\\LabProject\\StockPrice.txt");
		//the length of string array
		int numrows = original.length;
		//splits the first string at every tab for original
		int numcols = original[0].split("\t").length;

		//creates a double array with the # of rows and cols
		double[][] array = new double[numrows][numcols];
		//will take in the values for change
        double change[] = new double[numrows];

        //splits the first string at every tab for stockPrice
        //String numcols2[] = stockPrice[0].split("\\t");
        //int[] array2 = new int[numcols2];

		//stores the sum of all the rows
		double addarr[] = new double[numrows]; //stores the sum of all rows
		//used in the change formula (sumproduct/sum of invested amount)
		//using to calculate sum product and to refresh the row
		double s1 = 0;
		double s2 = 0;
		//double mean = 0;

        //stores the values of the stock and get rids of the extra 0s
		double stockPriceAr[] = new double[numcols-1];
		//will take in the amount of stock bought
        int qty[] = {0,0,0,0,12,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,20,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,24,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        /*goes through rows and cols,splits at tab
         *fills up the array
         *parses each value from a String to a double
         */
		for(int i=1;i<numrows;i++)
		{
			for(int j=1;j<numcols;j++)
			{
				array[i][j]=Double.parseDouble(original[i].split("\t")[j]);
			}
		}
      //parses each value from a String to a double
      for(int i=0;i<stockPriceAr.length;i++)
      {
      	stockPriceAr[i] = Double.parseDouble(stockPrice[i]);
      }

      //implementing the change formula
      //calculate the sumproduct
      for(int i=1; i<numrows; i++)
      {
      	s1 = 0;

      	for(int j=1; j<numcols; j++)
      	{
      		//calculate sum of the rows
      		s1 = array[i][j]+s1;
      	}
      	//makes sure that the add array starts at index 0 of addarr
      	addarr[i-1] = s1;
      }

        //variable to store total amount invested
      	double totalAmountInvested = 0.0;
      	//Get sumproduct
      	for(int i =1; i<numcols; i++)
      	{
      		for(int j=1; j<numrows; j++)
      		{
      			//take in value multiply by qty multiply by stockprice will give you change
      			//j-1 = 0 will give you change
      			change[j-1] = (array[j][i]*qty[i-1]*stockPriceAr[i-1])+change[j-1];
      		}
      		totalAmountInvested = (qty[i-1]*stockPriceAr[i-1])+totalAmountInvested;
      	}
      	//dividing sumproduct by sum
      	//getting invested value by multiplying stockprices by the qty
      	for(int i=0; i<change.length; i++)
      	{
      		double s3 = 0;
      		for(int j=0;j<stockPriceAr.length;j++)
      		{
      			s3 = s3 + (stockPriceAr[j]*qty[j]);
      		}
      		//sumproduct divide by sum
      		change[i] = change[i]/s3;
      	}


      	System.out.println("\n " + ST(change));
		System.out.println("0,0,0,0,12,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,20,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,24,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0");
	}

    public static double ST(double stdev[])
    {
    	//to find the mean -> e.g (2+3+1)/3
    	//we need to declare size so that we can divide the total by this value
    	int size = stdev.length;
    	//need two variables to get two means
    	double sum1 =0;
    	double sum2 = 0;
    	//goes through length of the array for the sum
    	for(int i=0; i<stdev.length; i++)
    	{
    		sum1 = sum1 + stdev[i];
    	}

    	//divide total to get first mean
    	double mean1 = sum1/size;


    	for(int i=0; i<stdev.length; i++)
    	{
    		//subtract mean from each number and square
    		double sub1 = stdev[i]-mean1;
    		//fill in the array with these new values
    		stdev[i] = Math.pow(sub1, 2);
    	}

    	//work out the mean of new numbers
    	for(int i=0; i<stdev.length; i++)
    	{
    		//same method as top
    		sum2 = sum2 + stdev[i];
    	}
    	//divide total to get second mean
    	double mean2 = sum2/size;
    	//sqrt the answer for the second mean
    	mean2 = Math.sqrt(mean2);

    	return mean2;
      }

 }