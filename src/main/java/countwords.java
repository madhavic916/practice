
public class countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Java";
		String[] str1 = str.split(" ");
		int count=0; 
		for(String word:str1)
		{
			count++;
		}
		System.out.println(count);
		
		

	}

}
