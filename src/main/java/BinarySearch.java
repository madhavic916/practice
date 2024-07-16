import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,30,50,10};
		
		Arrays.sort(arr);
				
	   System.out.println(Arrays.toString(arr));

		

		int key = 50;
		int l = 0;
		int h = arr.length-1;
		boolean flag = false;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(arr[m]==key)
			{
				System.out.println("ele found"+arr[m]);
				flag = true;
				break;
			}
			
			if(arr[m]<key)
			{
				l=m+1;
			}
			if(arr[m]>key)
			{
				h=m+1;
			}
			
		}
		if(flag==false)
		{
			System.out.println("element not found");

		}
		

	}

}
