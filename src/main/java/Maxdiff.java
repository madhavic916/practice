
public class Maxdiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,10,-5,-8,7};
		int maxdiff= arr[1]-arr[0]; 
		int minele = arr[0]; 
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]-minele>maxdiff)  
			{
				maxdiff=arr[i]-minele;
			}
			else if(arr[i]<minele)
			{
				minele = arr[i];
			}
		}
		
		
		System.out.println(maxdiff);

	}

}
