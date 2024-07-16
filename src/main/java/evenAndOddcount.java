
public class evenAndOddcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      int num = 123456789;
		int eve =0;
		int odd = 0;
		int rem =0;
	
		while(num>0)
		{			
			rem = num%10;
			if(rem%2 == 0)
			{
				eve++;			
				
			}
			else
			{
				odd++;
			}
			
			num= num/10;
						
		}
		System.out.println(eve);
		System.out.println(odd);


	}
}




	


