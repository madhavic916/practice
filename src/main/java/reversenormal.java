
public class reversenormal {

	public static void main(String[] args) {

		
		String str = "Reverse";
		String reverser = "";
		for(int i=0;i<str.length() ;i++)
		{
			
         reverser=str.charAt(i)+reverser;
		
	
	}
		System.out.println(reverser);
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		StringBuilder rev= sb.reverse();
		System.out.println(rev);



}


	}


