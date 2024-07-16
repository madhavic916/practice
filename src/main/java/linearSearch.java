
public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,50,60};
		int key = 20;
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==key)
			{
				System.out.println("key found"+arr[i]);
				flag = true;
						
			}
					
		}
		if(flag==false)
		{
			System.out.println("key not found");
		}

	}

}
