public class Stdv{
	public static void main (String args[]){
		// calculating mean.

		int total = 0;
		double vol [] = new double [881];

		for(int i = 0; i < vol.length; i++){
		   total += vol[i]; // this is the calculation for summing up all the values
		}

		double mean = total / vol.length;
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		for(int i = 0; i < array.length; i++){
			   vol[i] = Math.pow((vol[i]-mean),2)
			}
		}

}