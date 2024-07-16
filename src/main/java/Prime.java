import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count =0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;				
					
			}
			
			if(count==2)
			{
			  System.out.println("number is prime");
			}
			else
			{
				  System.out.println("number is notprime");

				
			}
			
		}
		else
		{
			System.out.println("num is not prime");
		}
		
		

	}

}
