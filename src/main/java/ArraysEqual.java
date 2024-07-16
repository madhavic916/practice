import java.util.Arrays;

public class ArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1[] = {1,2,3,4,5};
		int num2[] = {2,3,4,5,6};
		boolean status = Arrays.equals(num1,num2);
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");

		}
		
		
		
}
}
