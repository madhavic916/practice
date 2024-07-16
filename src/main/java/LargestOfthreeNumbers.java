
public class LargestOfthreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {23,45,90};
		int max = num[0];
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max = num[i];
				
			}
			
		}
		System.out.println(max);

	}

}
