
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12367;
		int rem = 0;
		while(num>0)
		{
			rem = rem + num%10;
			num = num/10;
			
		}
		System.out.println(rem);

	}

}
