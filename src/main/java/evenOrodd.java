
public class evenOrodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,4,4,5};
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println("even numbers are"+num[i]);
			}
			else if(num[i]%2!=0)
			{
				System.out.println("Odd numbers are"+num[i]);

			}
			
		}
		
		

	}

}
