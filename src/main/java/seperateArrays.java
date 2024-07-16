import java.util.Arrays;

public class seperateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1,-5,6,7,4,-6};
		int posArr[] = new int[10];
		int negArr[] = new int[10];
		int posCount = 0;
		int negCount = 0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>0)
			{
				posArr[posCount] = arr1[i];
				posCount++;
				
			}
			
			else 
			{
				negArr[negCount] = arr1[i];
				negCount++;
			}
			
			
		}
		System.out.println(Arrays.toString(posArr));
		System.out.println(Arrays.toString(negArr));




	}

	private static int arr1(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
