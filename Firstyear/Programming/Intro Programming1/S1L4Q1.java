public class S1L4Q1
{
	public static void main(String args[])
	{
		char car,moto,bike,truck,van;
		car='c';
		moto='m';
		bike='b';
		truck='t';
		van='v';

		switch('c')
		{
			case 'c':System.out.println("€2.00");break;
			case 'm':System.out.println("€1.10");break;
			case 'b':System.out.println("€4.25");break;
			case 't':System.out.println("€6.70");break;
			case 'v':System.out.println("€4.00");break;

			default:System.out.println("Free");break;
		}
	}
}