
public class maxminOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[] = {20,10,40,50,30};
		int max = a1[0];
				
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]>max)
			{
				max= a1[i];
			}
		}
		System.out.print(max);

	}

}
