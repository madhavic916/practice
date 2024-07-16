import java.util.Scanner;

public class palindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scn = new Scanner(System.in);
		int num = 232;
		int rev=0;
		int originalnum = num;
		
		while(num!=0)
		{
			rev = rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
		if(originalnum==rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");

		}

	}

}
