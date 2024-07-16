
public class leapyear {

	public static void main(String[] args) {
		
		int Year = 2000;
		if((Year%4==0)||(Year%400 == 0)&(Year%100!=0))
		{
			System.out.println("Year is leap year");
			
		}
		else
		{
			System.out.println("Year is not leap year");

		}

	}

}
