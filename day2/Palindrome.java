package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=123;
		int original_input=input;
		int reversednum=0;
		while(input!=0)
		{
			int remainder=input%10;
			reversednum=reversednum*10+remainder; 
			input=input/10;
			
		}
		if (reversednum==original_input)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}

}
