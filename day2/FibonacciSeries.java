package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args)
	{
		int Number =5;
		int n1=0,n2=1;
		for (int i =0;i <=Number;i++)
		{
			
			System.out.println(n1+" ");
			
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			
		}
		
	}

}
